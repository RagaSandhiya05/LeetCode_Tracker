// Last updated: 7/9/2026, 9:57:36 AM
// Find the Difference
class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        for(int i = 0 ; i < t.length() ; i++) {
            sum = sum + t.charAt(i);
        }
        for(int i = 0 ; i < s.length() ; i++) {
            sum = sum - s.charAt(i);
        }
        return (char)sum;
    }
}
     