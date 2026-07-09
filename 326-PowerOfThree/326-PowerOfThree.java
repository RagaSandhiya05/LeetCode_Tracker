// Last updated: 7/9/2026, 9:57:57 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0){
            return false;
        }
        while(n % 3 == 0){
            n = n / 3;
        }
        if(n == 1){
            return true;
        }
        else{
            return false;
        }
    }
}
      