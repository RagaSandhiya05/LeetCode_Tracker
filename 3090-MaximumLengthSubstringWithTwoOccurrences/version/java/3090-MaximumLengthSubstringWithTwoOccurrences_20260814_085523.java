// Last updated: 8/14/2026, 8:55:23 AM
1// Maximum Length Substring With Two Occurrences
2class Solution {
3    public int maximumLengthSubstring(String s) {
4        int count[] = new int[26];
5        int max = 0;
6        int left = 0;
7        for(int right = 0 ; right < s.length() ; right++) {
8            int charIndex = s.charAt(right) - 'a';
9            count[charIndex]++;
10            while(count[charIndex] > 2) {
11                count[s.charAt(left) - 'a']--;
12                left++;
13            }
14            max = Math.max(max , right - left + 1);
15        }
16        return max;
17    }
18}
19           