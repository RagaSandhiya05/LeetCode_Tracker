// Last updated: 7/9/2026, 9:52:57 AM
class Solution {
    public String sortSentence(String s) {
        int i,j;
        String[] words = s.split(" ");
        String[] ans = new String[words.length];
        for(i = 0 ; i < words.length ; i++){
            String t = words[i];
            int l = t.length();
            int ind = Character.getNumericValue(t.charAt(l-1));
            ans[ind-1] = words[i].substring(0,l-1);
        }
        return String.join(" " , ans);
    }
}
        