// Last updated: 7/9/2026, 9:57:13 AM
// Number of Segments in a String
class Solution {
    public int countSegments(String s) {
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        return count;
    }
}
           