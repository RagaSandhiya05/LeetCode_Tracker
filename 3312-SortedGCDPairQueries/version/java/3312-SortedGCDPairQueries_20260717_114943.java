// Last updated: 7/17/2026, 11:49:43 AM
1// Sorted GCD Pair Queries
2class Solution {
3    public int[] gcdValues(int[] nums, long[] queries) {
4        int max = 0;
5        for(int num : nums) {
6            max = Math.max(max , num);
7        }
8            int freq[] = new int[max + 1];
9            for(int num : nums) {
10                freq[num]++;
11            }
12            long divisibleCount[] = new long[max + 1];
13            for(int g = 1 ; g <= max ; g++) {
14                for(int multiple = g ; multiple <= max ; multiple = multiple + g) {
15                    divisibleCount[g] += freq[multiple];
16                }
17            }
18            long excatPairs[] = new long[max + 1];
19            for(int g = max ; g >= 1 ; g--) {
20                long count = divisibleCount[g];
21                excatPairs[g] = count * (count - 1) / 2;
22                for(int multiple = g * 2 ; multiple <= max ; multiple = multiple + g) {
23                    excatPairs[g] = excatPairs[g] - excatPairs[multiple];
24                }
25            }
26            long prefix[] = new long[max + 1];
27            for(int g = 1 ; g <= max ; g++) {
28                prefix[g] = prefix[g - 1] + excatPairs[g];
29            }
30            int ans[] = new int[queries.length];
31            for(int i = 0 ; i < queries.length ; i++) {
32                ans[i] = lowerBound(prefix , queries[i] + 1);
33            }
34            return ans;
35        }
36        private int lowerBound(long prefix[] , long target) {
37            int left = 1;
38            int right = prefix.length - 1;
39            while(left < right) {
40                int mid = left + (right - left) / 2;
41                if(prefix[mid] >= target) {
42                    right = mid;
43                }
44                else {
45                    left = mid + 1;
46                }
47            }
48            return left;
49        }
50}
51        