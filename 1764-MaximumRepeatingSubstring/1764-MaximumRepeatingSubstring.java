// Last updated: 7/9/2026, 9:53:43 AM
// Maximum Repeating Substring
class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String repeat = word;
        while(sequence.contains(repeat)) {
            repeat = repeat + word;
            count++;
        }
        return count;
    }
}
