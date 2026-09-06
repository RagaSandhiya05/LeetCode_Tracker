// Last updated: 9/6/2026, 11:45:37 AM
1// Distinct Subsequences
2class Solution {
3
4    public int numDistinct(String B, String A) {
5        int lenA = A.length();
6        int lenB = B.length();
7
8        Integer[][] memo = new Integer[lenA][lenB];
9
10        return solve(A, B, lenA - 1, lenB - 1, memo);
11    }
12
13    private int solve(String A, String B, int i, int j, Integer[][] memo) {
14
15        if (i < 0) return 1;
16
17        if (j < 0) return 0;
18
19        if (j < i) return 0;
20
21        if (memo[i][j] != null)
22            return memo[i][j];
23
24        if (A.charAt(i) == B.charAt(j)) {
25
26            return memo[i][j] =
27                solve(A, B, i - 1, j - 1, memo)
28                + solve(A, B, i, j - 1, memo);
29        }
30
31        return memo[i][j] =
32            solve(A, B, i, j - 1, memo);
33    }
34}