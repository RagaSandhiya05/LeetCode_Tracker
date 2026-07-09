// Last updated: 7/9/2026, 9:57:37 AM
class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for(char i : s.toCharArray()) count[i - 'a']++;
        for(int i = 0 ; i < s.length() ; i++) {
            if(count[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}
       