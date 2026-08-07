// Last updated: 8/7/2026, 1:49:37 PM
1// Replace Words
2class Solution {
3    public String replaceWords(List<String> dictionary, String sentence) {
4        Set<String> st = new HashSet<>(dictionary);
5        StringBuilder sb = new StringBuilder();
6        String words[] = sentence.split(" ");
7        for(String word : words) {
8            sb.append(findRoot(word , st)).append(" ");
9        }
10        return sb.toString().trim();
11    }
12    private String findRoot(String word , Set<String> st) {
13        for(int i = 0 ; i < word.length() ; i++) {
14            String root = word.substring(0 , i);
15            if(st.contains(root)) {
16                return root;
17            }
18        }
19        return word;
20    }
21}
22   