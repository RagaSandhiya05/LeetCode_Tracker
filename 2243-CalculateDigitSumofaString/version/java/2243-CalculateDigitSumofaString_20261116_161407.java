// Last updated: 11/16/2026, 4:14:07 PM
1// Calculate Digit Sum of a String
2class Solution {
3    public String digitSum(String s, int k) {
4        while(s.length() > k) {
5            StringBuilder next = new StringBuilder();
6            for(int i = 0 ; i < s.length() ; i = i + k) {
7                int sum = 0;
8                for(int j = i ; j < s.length() && j < i + k ; j++) {
9                    sum = sum + s.charAt(j) - '0';
10                }
11                next.append(sum);
12            }
13            s = next.toString();
14        }
15        return s;
16    }
17}
18              