// Last updated: 7/9/2026, 9:55:06 AM
// Maximum Number of Balloons
class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        for(char ch : text.toCharArray()) {
            switch(ch) {
                case 'b' : b++;
                break;
                case 'a' : a++;
                break;
                case 'l' : l++;
                break;
                case 'o' : o++;
                break;
                case 'n' : n++;
                break;
            }
        }
        return Math.min(b , Math.min(a , Math.min(n , Math.min(l / 2 , o / 2))));
    }
}