// Last updated: 10/8/2026, 10:14:29 PM
1// Remove Outermost Parentheses
2class Solution {
3    public String removeOuterParentheses(String s) {
4        StringBuilder res = new StringBuilder();
5        int bal = 0;
6        for(char ch : s.toCharArray()) {
7            if(ch == '(') {
8                if(bal > 0)
9                res.append(ch);
10                bal++;
11            }
12            else {
13                bal--;
14                if(bal > 0)
15                res.append(ch);
16            }
17        }
18        return res.toString();
19    }
20}
21           