// Last updated: 9/16/2026, 9:19:53 AM
1// Number of Sets of K Non-Overlapping Line Segments
2class Solution {
3    private static final long MOD = 1_000_000_007L;
4    private long modPow(long base, long exp) {
5        long result = 1;
6        while (exp > 0) {
7            if ((exp & 1L) != 0) {
8                result = result * base % MOD;
9            }
10            base = base * base % MOD;
11            exp >>= 1;
12        }
13        return result;
14    }
15    public int numberOfSets(int n, int k) {
16        long N = n + k - 1L;
17        long R = 2L * k;
18        R = Math.min(R, N - R);
19        long numerator = 1;
20        long denominator = 1;
21        for (long i = 1; i <= R; i++) {
22            numerator = numerator * (N - R + i) % MOD;
23            denominator = denominator * i % MOD;
24        }
25        long inverseDenominator = modPow(denominator, MOD - 2);
26        return (int) (numerator * inverseDenominator % MOD);
27    }
28}