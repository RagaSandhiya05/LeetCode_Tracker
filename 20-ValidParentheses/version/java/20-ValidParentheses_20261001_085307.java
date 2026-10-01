// Last updated: 10/1/2026, 8:53:07 AM
1// Valid Parentheses
2class Solution {
3    public boolean isValid(String s) {
4        Stack<Character> st = new Stack<>();
5        for(char ch : s.toCharArray()) {
6            if(ch =='(' || ch == '{' || ch == '[') {
7                st.push(ch);
8            }
9            else {
10                if(st.isEmpty())
11                return false;
12                char top = st.pop();
13                if((ch == ')' && top != '(') || (ch =='}' && top != '{') || (ch == ']' && top != '[')) {
14                    return false;
15                }
16            }
17        }
18        return st.isEmpty();
19    }
20}
21              