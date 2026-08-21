// Last updated: 8/21/2026, 9:22:36 AM
1// Kth Smallest Amount With Single Denomination Combination
2class Solution {
3    public long findKthSmallest(int[] coins, int k) {
4        long low = 1;
5        long high = (long) k * coins[0];
6        for(int coin : coins) {
7            high = Math.min(high, (long) k * coin);
8        }
9        while(low < high) {
10            long mid = low + (high - low) / 2;
11            if(count(mid, coins) >= k) {
12                high = mid;
13            }
14            else {
15                low = mid + 1;
16            }
17        }
18        return low;
19    }
20    private long count(long x, int[] coins) {
21        long total = 0;
22        int n = coins.length;
23        for(int mask = 1; mask < (1 << n); mask++) {
24            long lcm = 1;
25            int bits = 0;
26            boolean valid = true;
27            for(int i = 0; i < n; i++) {
28                if((mask & (1 << i)) != 0) {
29                    bits++;
30                    long gcd = gcd(lcm, coins[i]);
31                    lcm = lcm / gcd * coins[i];
32                    if(lcm > x) {
33                        valid = false;
34                        break;
35                    }
36                }
37            }
38            if(valid) {
39                long value = x / lcm;
40                if(bits % 2 == 1) {
41                    total += value;
42                }
43                else {
44                    total -= value;
45                }
46            }
47        }
48        return total;
49    }
50    private long gcd(long a, long b) {
51        while(b != 0) {
52            long temp = a % b;
53            a = b;
54            b = temp;
55        }
56        return a;
57    }
58}