// Last updated: 10/3/2026, 11:32:38 AM
1// Longest Valid Parentheses
2class Solution {
3    public int longestValidParentheses(String s) {
4        int answer = 0;
5        int open = 0, close = 0;
6
7        for (int i = 0; i < s.length(); i++) {
8            if (s.charAt(i) == '(') open++;
9            else close++;
10
11            if (open == close) {
12                answer = Math.max(answer, 2 * close);
13            } else if (close > open) {
14                open = close = 0;
15            }
16        }
17
18        open = close = 0;
19        for (int i = s.length() - 1; i >= 0; i--) {
20            if (s.charAt(i) == '(') open++;
21            else close++;
22
23            if (open == close) {
24                answer = Math.max(answer, 2 * open);
25            } else if (open > close) {
26                open = close = 0;
27            }
28        }
29
30        return answer;
31    }
32}