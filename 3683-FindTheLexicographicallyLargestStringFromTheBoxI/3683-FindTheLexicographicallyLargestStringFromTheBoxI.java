// Last updated: 7/9/2026, 9:48:13 AM
class Solution {
    public String answerString(String word, int numFriends) {
        if(numFriends==1) return word;
        int n = word.length();
        int longestPossibleLen = n-(numFriends-1);
        String res = "";
        for(int i=0;i<n;i++) 
        {
            int possibleLen = Math.min(longestPossibleLen , (n-i));
            String sub = word.substring(i,i+possibleLen);
            if(sub.compareTo(res)>0)
            {
                res=sub;
            }
        }
        return res;
        
    }
}