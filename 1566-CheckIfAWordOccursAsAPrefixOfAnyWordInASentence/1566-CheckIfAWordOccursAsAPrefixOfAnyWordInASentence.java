// Last updated: 7/9/2026, 9:54:18 AM
// Check If a Word Occurs As a Prefix of Any Word in a Sentence
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String words[] = sentence.split(" ");
        for(int i = 0 ; i < words.length ; i++) {
            if(words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}