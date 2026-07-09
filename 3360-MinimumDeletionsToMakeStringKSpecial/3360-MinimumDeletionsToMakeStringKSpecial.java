// Last updated: 7/9/2026, 9:49:35 AM
class Solution {
    public int minimumDeletions(String word, int k) {
        int[] freq = new int[26];
        for(char ch : word.toCharArray()){
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        int result = Integer.MAX_VALUE;
        int deletedTilNow = 0;
        for(int i = 0 ; i < 26 ; i++) {
            int minFreq = freq[i];
            int temp = deletedTilNow;
            for(int j = 25 ; j > 1 ; j--) {
                if(freq[j] - freq[i] <= k) 
                break;
                temp += freq[j] - minFreq - k;
            }
            result = Math.min(result , temp);
            deletedTilNow += minFreq;
        }
        return result;
    }
}