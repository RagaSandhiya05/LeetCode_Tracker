// Last updated: 10/5/2026, 10:23:44 AM
1// Score of Parentheses
2class Solution {
3    public int scoreOfParentheses(String s) {
4        int score = 0;
5        int depth = 0;
6        for(int i = 0 ; i < s.length() ; ++i) {
7            if(s.charAt(i) == '(') {
8                ++depth;
9            }
10            else {
11                --depth;
12                if(s.charAt(i - 1) == '(') {
13                    score += 1 << depth;
14                }
15            }
16        }
17        return score;
18    }
19}
20               