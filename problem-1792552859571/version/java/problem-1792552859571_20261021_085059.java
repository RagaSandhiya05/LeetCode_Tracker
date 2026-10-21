// Last updated: 10/21/2026, 8:50:59 AM
1// Minimum Operations to Sort a String
2class Solution {
3    public int minOperations(String s) {
4        int n = s.length();
5        boolean flag = true;
6        for(int i=0;i<n;i++) {
7            if(i > 0 && s.charAt(i) < s.charAt(i-1)) {
8                flag = false;
9                break;
10            }
11        }
12        if(flag) {
13            return 0;
14        }
15        if(n == 2) {
16            return -1;
17        }
18        char minChar = 'z';
19        char maxChar = 'a';
20        for(char ch : s.toCharArray()) {
21            minChar = (char)Math.min(minChar,ch);
22            maxChar = (char)Math.max(maxChar,ch);
23        }
24        if(minChar == s.charAt(0) || maxChar == s.charAt(n-1)) {
25            return 1;
26        }
27        for(int i=1;i<n-1;i++) {
28            if(s.charAt(i) == minChar || s.charAt(i) == maxChar) {
29                return 2;
30            }
31        }
32        return 3;
33    }
34}