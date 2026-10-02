// Last updated: 10/2/2026, 11:42:11 AM
1// Generate Parentheses
2class Solution {
3    private List<String> ans = new ArrayList<>();
4    private void backtrack(StringBuilder s, int open, int close, int n) {
5        if (s.length() == 2 * n) {
6            ans.add(s.toString());
7            return;
8        }
9        if (open < n) {
10            s.append('(');
11            backtrack(s, open + 1, close, n);
12            s.deleteCharAt(s.length() - 1);
13        }
14        if (close < open) {
15            s.append(')');
16            backtrack(s, open, close + 1, n);
17            s.deleteCharAt(s.length() - 1);
18        }
19    }
20    public List<String> generateParenthesis(int n) {
21        ans.clear();
22        StringBuilder s = new StringBuilder(2 * n);
23        backtrack(s, 0, 0, n);
24        return ans;
25    }
26}