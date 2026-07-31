// Last updated: 7/31/2026, 9:10:32 AM
1// Remove All Adjacent Duplicates In String
2class Solution {
3    public String removeDuplicates(String s) {
4        Stack<Character> stack = new Stack<>();
5        for(char ch : s.toCharArray()) {
6            if(!stack.isEmpty() && ch == stack.peek()) {
7                stack.pop();
8            }
9            else {
10                stack.push(ch);
11            }
12        }
13        StringBuilder result = new StringBuilder();
14        for(char ch : stack) {
15            result.append(ch);
16        }
17        return result.toString();
18    }
19}
20       