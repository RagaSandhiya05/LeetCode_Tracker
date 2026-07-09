// Last updated: 7/9/2026, 9:56:36 AM
class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i += 2*k) {
            for(int j = Math.min(i+k-1 , s.length()-1) ; j >= i ; j--) {
                res.append(s.charAt(j));
            }
            for(int j = i+k ; j < Math.min(i+2*k , s.length()) ; j++) {
                res.append(s.charAt(j));
            }
        }
        return res.toString();
    }
}
           