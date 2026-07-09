// Last updated: 7/9/2026, 10:01:29 AM
// Pow(x , n)
class Solution {
    public double myPow(double x, int n) {
        if(n < 0) {
            n = -n;
            x = 1 / x;
        }
        double pow = 1;
        while(n != 0) {
            if((n & 1) != 0) {
                pow = pow * x;
            }
            x = x * x;
            n >>>= 1;
        }
        return pow;
    }
}