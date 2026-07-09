// Last updated: 7/9/2026, 9:57:51 AM
//Reverse String
class Solution {
    public void reverseString(char[] s) {
        int l = 0 , h = s.length - 1;
        while(l < h) {
            char temp = s[l];
            s[l] = s[h];
            s[h] = temp;
            l++;
            h--;
        }
    }
}

