// Last updated: 10/8/2026, 10:19:59 PM
1// Minimum Add to Make Parentheses Valid
2class Solution {
3    public int minAddToMakeValid(String s) {
4        int opened = 0;
5        int added = 0;
6        for(char ch : s.toCharArray()) {
7            if(ch == '(')
8            opened++;
9            else if(opened > 0)
10            opened--;
11            else
12            added++;
13        }
14        return added + opened;
15    }
16}
17        