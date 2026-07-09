// Last updated: 7/9/2026, 9:56:09 AM
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        int[] numOfChars = new int[26];
        String minStr = "";
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < licensePlate.length() ; i++){
            char ch = licensePlate.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                numOfChars[ch - 'a']++;
            }
        }
        for(int i = 0 ; i < words.length ; i++){
            int[] numOfCharsTemp = numOfChars.clone();
            for(int j = 0 ; j < words[i].length() ; j++){
                char ch = words[i].charAt(j);
                numOfCharsTemp[ch - 'a']--;
            }
            boolean contains = true;
            for(int j = 0 ; j < numOfCharsTemp.length ; j++){
                if(numOfCharsTemp[j] > 0){
                    contains = false;
                    break;
                }
            }
            if(contains && words[i].length() < min)
            {
                min = words[i].length();
                minStr = words[i];
            }
        }
        return minStr;
    }
}
            