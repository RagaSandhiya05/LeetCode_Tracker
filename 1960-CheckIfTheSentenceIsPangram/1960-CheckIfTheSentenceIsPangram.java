// Last updated: 7/9/2026, 9:53:01 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26)
        return false;
        for(char ch = 'a' ; ch <= 'z' ; ch++){
            if(sentence.indexOf(ch) < 0){
                return false;
            }
        }
        return true;
    }
}
           