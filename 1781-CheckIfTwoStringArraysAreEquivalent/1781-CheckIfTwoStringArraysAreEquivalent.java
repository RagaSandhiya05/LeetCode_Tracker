// Last updated: 7/9/2026, 9:53:41 AM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("",word1).equals(String.join("",word2));
    }
}