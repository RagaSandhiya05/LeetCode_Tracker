// Last updated: 9/7/2026, 8:53:07 AM
1// Distinct Subsequences II
2class Solution {
3    public int distinctSubseqII(String s) {
4        final long MOD = 1000000007L;
5        long dp = 1;
6        long last[] = new long[26];
7        for(char ch : s.toCharArray()) {
8            int index = ch - 'a';
9            long oldDp = dp;
10            dp = (2 * dp - last[index] + MOD) % MOD;
11            last[index] = oldDp;
12        }
13        return (int) ((dp - 1 + MOD) % MOD);
14    }
15}