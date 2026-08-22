// Last updated: 8/22/2026, 10:07:29 AM
1// Check Divisibility by Digit Sum and Product
2class Solution {
3    public boolean checkDivisibility(int n) {
4        int Original = n;
5        int DigitSum = 0;
6        int DigitProduct = 1;
7        while(n > 0) {
8            int Digit = n % 10;
9            DigitSum = DigitSum + Digit;
10            DigitProduct = DigitProduct * Digit;
11            n = n / 10;
12        }
13        int Divisor = DigitSum + DigitProduct;
14        return Original % Divisor == 0;
15    }
16}
17
18       