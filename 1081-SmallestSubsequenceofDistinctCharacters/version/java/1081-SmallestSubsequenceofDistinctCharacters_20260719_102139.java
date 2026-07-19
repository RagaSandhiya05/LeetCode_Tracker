// Last updated: 7/19/2026, 10:21:39 AM
1// Smallest Subsequence of Distinct Characters
2class Solution {
3    public String smallestSubsequence(String s) {
4        int freq[] = new int[26];
5        for(char ch : s.toCharArray()) {
6            freq[ch - 'a']++;
7        }
8        boolean inStack[] = new boolean[26];
9        StringBuilder stack = new StringBuilder();
10        for(char ch : s.toCharArray()) {
11            freq[ch - 'a']--;
12            if(inStack[ch - 'a']) {
13                continue;
14            }
15            while(stack.length() > 0 && stack.charAt(stack.length() - 1) > ch && freq[stack.charAt(stack.length() - 1) - 'a'] > 0) {
16                inStack[stack.charAt(stack.length() - 1) - 'a'] = false;
17                stack.deleteCharAt(stack.length() - 1);
18            }
19            stack.append(ch);
20            inStack[ch - 'a'] = true;
21        }
22        return stack.toString();
23    }
24}
25            