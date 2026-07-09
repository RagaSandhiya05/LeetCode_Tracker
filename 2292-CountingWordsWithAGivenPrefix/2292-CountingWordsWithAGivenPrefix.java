// Last updated: 7/9/2026, 9:51:40 AM
// Counting Words With a Given Prefix
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int n = pref.length();
        for(String w : words) {
            if(w.length() >= n && w.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}
