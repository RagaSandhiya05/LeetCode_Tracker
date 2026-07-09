// Last updated: 7/9/2026, 9:56:04 AM
// Jewels and Stones
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(char j : jewels.toCharArray()) {
            for(char s : stones.toCharArray()) {
                if(j == s) {
                    count++;
                }
            }
        }
        return count;
    }
}
