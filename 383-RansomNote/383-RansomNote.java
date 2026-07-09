// Last updated: 7/9/2026, 9:57:41 AM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for(char ch : magazine.toCharArray()) {
            freq[ch - 'a']++;
        }
        for(char ch : ransomNote.toCharArray()) {
            if(freq[ch - 'a'] == 0) {
                return false;
            }
            freq[ch - 'a']--;
        }
        return true;
    }
}
           