// Last updated: 7/9/2026, 9:56:41 AM
// Detect Capital
class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalCount = 0;
        int n = word.length();
        for(int i = 0 ; i < n ; i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                capitalCount++;
            }
        }
        if(capitalCount == 0) {
            return true;
        }
        else if(capitalCount == n) {
            return true;
        }
        else if(capitalCount == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }
        else {
            return false;
        }
    }
}
       