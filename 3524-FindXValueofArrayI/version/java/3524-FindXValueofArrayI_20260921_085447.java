// Last updated: 9/21/2026, 8:54:47 AM
1// Find X Value of Array I
2class Solution {
3    public long[] resultArray(int[] nums, int k) {
4        long ans[] = new long[k];
5        long dp[] = new long[k];
6        for(int num : nums) {
7            int x = num % k;
8            long next[] = new long[k];
9            next[x]++;
10            for(int r = 0 ; r < k ; r++) {
11                int newR = (r * x) % k;
12                next[newR] = next[newR] + dp[r];
13            }
14            for(int r = 0 ; r < k ; r++) {
15                ans[r] = ans[r] + next[r];
16            }
17            dp = next;
18        }
19        return ans;
20    }
21}
22           