// Last updated: 7/9/2026, 10:01:23 AM
// Length of Last Word
class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0 , i = s.length() - 1;
        while(i >= 0 && s.charAt(i) == ' ')
        i--;
        while(i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }
        return len;
    }
}
        