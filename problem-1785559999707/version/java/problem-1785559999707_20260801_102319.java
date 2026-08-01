// Last updated: 8/1/2026, 10:23:19 AM
1// Predict the Winner
2class Solution {
3    public boolean predictTheWinner(int[] nums) {
4        int n = nums.length;
5        if(n % 2 == 0)
6        return true;
7        int dp[] = nums.clone();
8        for(int i = n - 2 ; i >= 0 ; --i) {
9            for(int j = i + 1 ; j < n ; j++) {
10                dp[j] = Math.max(nums[i] - dp[j] , nums[j] - dp[j - 1]);
11            }
12        }
13        return dp[n - 1] >= 0;
14    }
15}
16          