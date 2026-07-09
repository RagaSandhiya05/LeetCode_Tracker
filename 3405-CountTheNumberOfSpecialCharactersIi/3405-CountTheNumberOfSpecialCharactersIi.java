// Last updated: 7/9/2026, 9:49:25 AM
// Count the Number of Special Characters II
class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        for(char w = 'a' ; w <= 'z' ; w++) {
            char up = Character.toUpperCase(w);
            int lastLower = word.lastIndexOf(w);
            int firstUpper = word.indexOf(up);
            if(lastLower != -1 && firstUpper != -1 && lastLower < firstUpper) {
                count++;
            }
        }
        return count;
    }
}
           