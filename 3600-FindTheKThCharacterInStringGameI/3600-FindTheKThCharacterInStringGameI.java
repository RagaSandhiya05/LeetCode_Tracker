// Last updated: 7/9/2026, 9:48:28 AM
class Solution {
    private String getNewString(String s){
        StringBuilder sb = new StringBuilder(s);
        StringBuilder temp = new StringBuilder();

        for(char ch: s.toCharArray()){
            char nextChar = (char)(((ch - 'a' + 1) % 26) + 'a');
            temp.append(nextChar);
        }

        return sb.append(temp).toString();
    }

    public char kthCharacter(int k) {
        String s = "a";

        while(s.length() < k){
            s = getNewString(s);
        }

        return s.charAt(k - 1);
    }
}