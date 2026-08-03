// Last updated: 8/3/2026, 9:02:35 AM
1// Stone Game III
2class Solution {
3    public String stoneGameIII(int[] stoneValue) {
4        int n = stoneValue.length;
5        int dp[] = new int[n + 1];
6        for(int i = n - 1 ; i >= 0 ; i--) {
7            int best = Integer.MIN_VALUE;
8            int runningSum = 0;
9            for(int k = 1 ; k <= 3 ; k++) {
10                if(i + k > n) 
11                break;
12                runningSum = runningSum + stoneValue[i + k - 1];
13                best = Math.max(best , runningSum - dp[i + k]);
14            }
15            dp[i] = best;
16        }
17        if(dp[0] > 0)
18        return "Alice";
19        else if(dp[0] < 0) 
20        return "Bob";
21        else
22        return "Tie";
23    }
24}
25
26              