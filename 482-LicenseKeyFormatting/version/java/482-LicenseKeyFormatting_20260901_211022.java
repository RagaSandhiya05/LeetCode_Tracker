// Last updated: 9/1/2026, 9:10:22 PM
1// License Key Formatting
2class Solution {
3    public String licenseKeyFormatting(String s, int k) {
4        int count = 0;
5        s = s.toUpperCase();
6        StringBuilder sb = new StringBuilder();
7        for(int i = s.length() - 1 ; i >= 0 ; i--) {
8            char ch = s.charAt(i);
9            if(ch == '-') {
10                continue;
11            }
12            if(count == k) {
13                sb.append('-');
14                count = 0;
15            }
16            sb.append(ch);
17            count++;
18        }
19        return sb.reverse().toString();
20    }
21}
22           