// Last updated: 9/15/2026, 12:19:50 PM
1// Maximum Number of Non-overlapping Palindrome Substrings
2class Solution {
3    public int maxPalindromes(String s, int k) {
4        int n = s.length();
5        boolean[][] pal = new boolean[n][n];
6
7        for (int len = 1; len <= n; len++) {
8            for (int l = 0; l + len <= n; l++) {
9                int r = l + len - 1;
10
11                if (s.charAt(l) == s.charAt(r) &&
12                    (len <= 2 || pal[l + 1][r - 1])) {
13                    pal[l][r] = true;
14                }
15            }
16        }
17
18        int[] dp = new int[n + 1];
19
20        for (int i = 0; i < n; i++) {
21            dp[i + 1] = dp[i];
22
23            for (int j = 0; j <= i; j++) {
24                if (i - j + 1 >= k && pal[j][i]) {
25                    dp[i + 1] = Math.max(dp[i + 1], dp[j] + 1);
26                }
27            }
28        }
29
30        return dp[n];
31    }
32}