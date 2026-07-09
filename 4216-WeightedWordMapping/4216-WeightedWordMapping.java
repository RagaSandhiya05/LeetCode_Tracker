// Last updated: 7/9/2026, 9:45:55 AM
// Weighted Word Mapping
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();
        for(String word : words) {
            int sumWeight = 0;
            for(char ch : word.toCharArray()) {
                sumWeight = sumWeight + weights[ch - 'a'];
            }
            int value = sumWeight % 26;
            result.append((char)('z' - value));
        }
        return result.toString();
    }
}