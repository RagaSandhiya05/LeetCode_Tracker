// Last updated: 8/9/2026, 9:52:22 AM
1// Stone Game II
2class Solution {
3    public int stoneGameII(int[] piles) {
4        int n = piles.length;
5        int[] suffixSum = new int[n + 1];        
6        for (int i = n - 1; i >= 0; i--) {
7            suffixSum[i] = suffixSum[i + 1] + piles[i];
8        }
9        Integer[][] memo = new Integer[n][n + 1];
10                return dfs(0, 1, piles, suffixSum, memo);
11    }
12        private int dfs(int i, int M, int[] piles, int[] suffixSum, Integer[][] memo) {
13        int n = piles.length;
14        if (i >= n) return 0;
15            if (2 * M >= n - i) {
16            return suffixSum[i];
17        }
18                if (memo[i][M] != null) return memo[i][M];
19        
20        int best = 0;
21        for (int X = 1; X <= 2 * M; X++) {
22            int opponent = dfs(i + X, Math.max(M, X), piles, suffixSum, memo);
23            best = Math.max(best, suffixSum[i] - opponent);
24        }
25                memo[i][M] = best;
26        return best;
27    }
28}