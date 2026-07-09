// Last updated: 7/9/2026, 10:02:08 AM
// Longest Common Prefix
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int index = 1 ; index < strs.length ; index++) {
            while(strs[index].indexOf(prefix) != 0) {
                prefix = prefix.substring(0 , prefix.length() - 1);
            }
        }
        return prefix;
    }
}
            