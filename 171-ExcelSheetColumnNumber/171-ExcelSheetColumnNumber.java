// Last updated: 7/9/2026, 9:58:52 AM
// Excel Sheet Column Number
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for(char ch : columnTitle.toCharArray()) {
            result = result * 26 + (ch - 'A' + 1);
        }
        return result;
    }
}