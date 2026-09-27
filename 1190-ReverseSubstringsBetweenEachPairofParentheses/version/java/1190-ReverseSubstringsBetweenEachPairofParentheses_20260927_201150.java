// Last updated: 9/27/2026, 8:11:50 PM
1// Reverse Substrings Between Each Pair of Parentheses
2class Solution { 
3    public String reverseParentheses(String s) { 
4        int n = s.length();
5        int[] pair = new int[n];
6        Deque<Integer> st = new ArrayDeque<>();
7        for (int i = 0; i < n; ++i) {
8            if (s.charAt(i) == '(') st.push(i);
9            else if (s.charAt(i) == ')') {
10                int j = st.pop();
11                pair[i] = j;
12                pair[j] = i;
13            }
14        }
15        StringBuilder res = new StringBuilder();
16        int i = 0, dir = 1;
17        while (i >= 0 && i < n) {
18            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
19                i = pair[i];
20                dir = -dir;
21            } else {
22                res.append(s.charAt(i));
23            }
24            i += dir;
25        }
26        return res.toString();
27    } 
28}