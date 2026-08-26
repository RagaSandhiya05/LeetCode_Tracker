// Last updated: 8/26/2026, 1:44:50 PM
1// Shortest and Lexicographically Smallest Beautiful String
2class Solution {
3    public String shortestBeautifulSubstring(String s, int k) {
4        String answer = "";
5        int left = 0;
6        int ones = 0;
7        for(int right = 0 ; right < s.length() ; right++) {
8            if(s.charAt(right) == '1') {
9                ones++;
10            }
11            while(ones > k) {
12                if(s.charAt(left) == '1') {
13                    ones--;
14                }
15                left++;
16            }
17            while(ones == k && s.charAt(left) == '0') {
18                left++;
19            }
20            if(ones == k) {
21                String candidate = s.substring(left , right + 1);
22                if(answer.isEmpty() || candidate.length() < answer.length() || (candidate.length() == answer.length() && candidate.compareTo(answer) < 0)) {
23                    answer = candidate;
24                }
25            }
26        }
27        return answer;
28    }
29}
30             