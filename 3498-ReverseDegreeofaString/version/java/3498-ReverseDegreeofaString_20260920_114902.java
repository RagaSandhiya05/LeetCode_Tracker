// Last updated: 9/20/2026, 11:49:02 AM
1// Reverse Degree of a String
2class Solution {
3    public int reverseDegree(String s) {
4        int sum = 0;
5        for(int i = 0 ; i < s.length() ; i++) {
6            char ch = s.charAt(i);
7            int reverseValue = 26 - (ch - 'a');
8            int position = i + 1;
9            sum = sum + reverseValue * position;
10        }
11        return sum;
12    }
13}
14      