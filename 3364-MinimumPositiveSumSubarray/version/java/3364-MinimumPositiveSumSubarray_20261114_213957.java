// Last updated: 11/14/2026, 9:39:57 PM
1// Minimum Positive Sum Subarray
2class Solution {
3    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
4        int n = nums.size();
5        int ans = Integer.MAX_VALUE;
6        for (int i = 0; i < n; i++) {
7            int sum = 0;
8            for (int j = i; j < n; j++) {
9                sum += nums.get(j);
10                int len = j - i + 1;
11                if (len >= l && len <= r && sum > 0) {
12                    ans = Math.min(ans, sum);
13                }
14            }
15        }
16        return ans == Integer.MAX_VALUE ? -1 : ans;
17    }
18}