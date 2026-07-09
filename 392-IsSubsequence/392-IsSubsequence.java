// Last updated: 7/9/2026, 9:57:34 AM
// Is Subsequence
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0 , j = 0;
        while(i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
            