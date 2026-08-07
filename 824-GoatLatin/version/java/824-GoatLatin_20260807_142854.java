// Last updated: 8/7/2026, 2:28:54 PM
1// Goat Latin
2class Solution {
3    public String toGoatLatin(String sentence) {
4        StringBuilder goatLatin = new StringBuilder();
5        String words[] = sentence.split(" ");
6        String vowels = "aeiouAEIOU";
7        for(int i = 0 ; i < words.length ; i++) {
8            String word = words[i];
9            char firstChar = word.charAt(0);
10            if(vowels.indexOf(firstChar) != -1) {
11                goatLatin.append(word);
12            }
13            else{
14                goatLatin.append(word.substring(1)).append(firstChar);
15            }
16            goatLatin.append("ma").append("a".repeat(i + 1));
17            if(i < words.length - 1) {
18                goatLatin.append(" ");
19            }
20        }
21        return goatLatin.toString();
22    }
23}
24           