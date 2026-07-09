// Last updated: 7/9/2026, 10:01:46 AM
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int wordCount = words.length;
        int wordLength = words[0].length();
        int totalLength = wordCount * wordLength;

        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) return result;
        Map<String, Integer> wordMap= new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        for(int i = 0; i < wordLength; i++){
            int left = i;
            int right = i;
            int count = 0;
            HashMap<String,Integer> window = new HashMap<>();

            while(right + wordLength <= s.length()){
                String key = s.substring(right, right + wordLength);
                right += wordLength;

                if(wordMap.containsKey(key)){
                    window.put(key, window.getOrDefault(key, 0) + 1);
                    count++;

                    while(window.get(key) > wordMap.get(key)){
                        String leftOver = s.substring(left , left + wordLength);
                        left += wordLength;
                        window.put(leftOver, window.get(leftOver) - 1);
                        count--;
                    }
                    if(count == wordCount){
                        result.add(left);
                    }
                } 
                else{
                    window.clear();
                    left = right;
                    count = 0;
                }
            }
        }
        return result;
    }
}