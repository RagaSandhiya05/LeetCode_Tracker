// Last updated: 7/9/2026, 9:49:26 AM
class Solution {
    private static final String VOWELS = "aeiouAEIOU";

    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        int v = 0, c = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isDigit(ch)) continue;

            if (Character.isLetter(ch)) {
                if (VOWELS.indexOf(ch) >= 0) ++v;
                else ++c;
            } else {
                return false;                 
            }
        }
        return v > 0 && c > 0;
    }
}