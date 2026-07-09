// Last updated: 7/9/2026, 9:55:59 AM
// Rotate String
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        String result = s + s;
        return result.contains(goal);
    }
}
       