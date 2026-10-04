// Last updated: 10/4/2026, 2:04:20 PM
1// Valid Parenthesis String
2class Solution {
3    public boolean checkValidString(String s) {
4        int l = 0, h = 0;
5        for (int i = 0; i < s.length(); i++) {
6            l += s.charAt(i) == '(' ? 1 : -1;
7            h += s.charAt(i) == ')' ? -1 : 1;
8            if (h < 0) return false;
9            l = Math.max(l, 0);
10        }
11        return l == 0;
12    }
13}