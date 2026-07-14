// Last updated: 7/14/2026, 9:44:26 AM
1// Find the Number of Subsequences With Equal GCD
2class Solution {
3    private static final int MOD = 1_000_000_007;
4    public int subsequencePairCount(int[] nums) {
5        int max = 0;
6        for (int x : nums) max = Math.max(max, x);
7        long[][] dp = new long[max + 1][max + 1];
8        dp[0][0] = 1;
9        for (int num : nums) {
10            long[][] next = new long[max + 1][max + 1];
11            for (int g1 = 0; g1 <= max; g1++) {
12                for (int g2 = 0; g2 <= max; g2++) {
13                    if (dp[g1][g2] == 0) continue;
14                    long ways = dp[g1][g2];
15                    next[g1][g2] = (next[g1][g2] + ways) % MOD;
16                    int ng1 = (g1 == 0) ? num : gcd(g1, num);
17                    next[ng1][g2] = (next[ng1][g2] + ways) % MOD;
18                    int ng2 = (g2 == 0) ? num : gcd(g2, num);
19                    next[g1][ng2] = (next[g1][ng2] + ways) % MOD;
20                }
21            }
22            dp = next;
23        }
24        long ans = 0;
25        for (int g = 1; g <= max; g++) {
26            ans = (ans + dp[g][g]) % MOD;
27        }
28        return (int) ans;
29    }
30    private int gcd(int a, int b) {
31        while (b != 0) {
32            int t = a % b;
33            a = b;
34            b = t;
35        }
36        return a;
37    }
38}