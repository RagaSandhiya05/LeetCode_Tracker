// Last updated: 7/9/2026, 9:57:54 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }
        while(n % 4 == 0){
            n = n / 4;
        }
        if(n == 1){
            return true;
        }
        else{
            return false;
        }
    }
}