// Last updated: 8/10/2026, 11:06:15 AM
1// Stone Game IV
2class Solution {
3    public boolean winnerSquareGame(int n) {
4        boolean dp[] = new boolean[n + 1];
5        for(int i = 1 ; i <= n ; i++) {
6            for(int j = 1 ; j * j <= i ; j++) {
7                if(!dp[i - j * j]) {
8                    dp[i] = true;
9                    break;
10                }
11            }
12        }
13        return dp[n];
14    }
15}
16
17               