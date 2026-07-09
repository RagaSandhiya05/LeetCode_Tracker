// Last updated: 7/9/2026, 9:48:53 AM
class Solution {
    public boolean doesAliceWin(String s) {
        for(char ch:s.toCharArray()) {
            if("aeiou".indexOf(ch)!=-1) {
                return true;
            }
        }
        return false;
    }
}