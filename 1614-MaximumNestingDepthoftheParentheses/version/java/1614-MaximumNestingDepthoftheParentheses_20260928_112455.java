// Last updated: 9/28/2026, 11:24:55 AM
1// Maximum Nesting Depth of the Parentheses
2class Solution {
3    public int maxDepth(String s) {
4        int depth = 0;
5        int MaxDepth = 0;
6        for(char ch : s.toCharArray()) {
7            if(ch == '(') {
8                depth++;
9                if(depth > MaxDepth)
10                MaxDepth = depth;
11            }
12            else if(ch == ')') {
13                depth--;
14            }
15        }
16        return MaxDepth;
17    }
18}
19           