// Last updated: 9/17/2026, 8:52:10 AM
1// Find Two Non-overlapping Sub-arrays Each With Target Sum
2class Solution {
3    public int minSumOfLengths(int[] A, int k) {
4        int n = A.length;
5        int res = n + 1, sum = 0, i = 0;
6        int[] dp = new int[n + 1];
7        Arrays.fill(dp, n);
8        for (int j = 0; j < n; j++) {
9            sum += A[j];
10            while (sum > k)
11                sum -= A[i++];
12            dp[j + 1] = dp[j];
13            if (sum == k) {
14                res = Math.min(res, j - i + 1 + dp[i]);
15                dp[j + 1] = Math.min(dp[j], j - i + 1);
16            }
17        }
18        return res == n + 1 ? -1 : res;
19    }
20}