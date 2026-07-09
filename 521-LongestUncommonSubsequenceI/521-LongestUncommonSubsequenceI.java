// Last updated: 7/9/2026, 9:56:39 AM
// Longest Uncommon Subsequence I
class Solution {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length() , b.length());
    }
}