// Last updated: 7/9/2026, 9:47:59 AM
class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        int max = 0;
        int min = s.length();
        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for(int i : freq) {
            if(i > 0) {
                if(i % 2 == 0)
                min = Math.min(min, i);
                else 
                max = Math.max(max, i);
            }
        }
        return max - min;
    }
}