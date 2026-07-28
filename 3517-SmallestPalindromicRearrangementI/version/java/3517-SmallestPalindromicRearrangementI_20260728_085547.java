// Last updated: 7/28/2026, 8:55:47 AM
1// Smallest Palindromic Rearrangement I
2class Solution {
3    public String smallestPalindrome(String s) {
4        int freq[] = new int[26];
5        for(char ch : s.toCharArray()) {
6            freq[ch - 'a']++;
7        }
8        int n = s.length();
9        char ans[] = new char[n];
10        int left = 0;
11        int right = n - 1;
12        for(int i = 0 ; i < 26 ; i++) {
13            while(freq[i] >= 2) {
14                ans[left++] = (char) ('a' + i);
15                ans[right--] = (char) ('a' + i);
16                freq[i] = freq[i] - 2;
17            }
18            if(freq[i] == 1) {
19                ans[n / 2] = (char) ('a' + i);
20            }
21        }
22        return new String(ans);
23    }
24}
25           