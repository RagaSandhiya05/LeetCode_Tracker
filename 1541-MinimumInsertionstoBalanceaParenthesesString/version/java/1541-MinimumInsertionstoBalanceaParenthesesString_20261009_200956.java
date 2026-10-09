// Last updated: 10/9/2026, 8:09:56 PM
1// Minimum Insertions to Balance a Parentheses String
2class Solution {
3    public int minInsertions(String s) {
4        int ans = 0, x = 0;
5        int n = s.length();
6        for (int i = 0; i < n; ++i) {
7            if (s.charAt(i) == '(') {
8                ++x;
9            } else {
10                if (i < n - 1 && s.charAt(i + 1) == ')') {
11                    ++i;
12                } else {
13                    ++ans;
14                }
15                if (x == 0) {
16                    ++ans;
17                } else {
18                    --x;
19                }
20            }
21        }
22        ans += x << 1;
23        return ans;
24    }
25}