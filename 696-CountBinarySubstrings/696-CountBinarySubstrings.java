// Last updated: 7/9/2026, 9:56:16 AM
class Solution {
    public int countBinarySubstrings(String s) {
        int prev = 0;
        int curr = 1;
        int ans = 0;
        for(int i = 1 ; i < s.length() ; i++){
            if(s.charAt(i) != s.charAt(i-1)){
                ans += Math.min(curr,prev);
                prev = curr;
                curr = 1;
            } else {
                curr++;
            }
        }
        return ans + Math.min(curr , prev);
    }
}
           