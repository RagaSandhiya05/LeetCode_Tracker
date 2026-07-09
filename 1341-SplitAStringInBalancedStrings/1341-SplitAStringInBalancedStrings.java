// Last updated: 7/9/2026, 9:55:03 AM
class Solution {
    public int balancedStringSplit(String s) {
        int r = 0, l = 0 , max = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == 'R')
            {
                r++;
            } else {
                l++;
            }
            if(r == l) max++;
        }
        return max;
    }
}
            