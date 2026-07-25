// Last updated: 7/25/2026, 8:58:39 AM
1// Maximum Product of Two Digits
2class Solution {
3    public int maxProduct(int n) {
4        int digit1 = 0;
5        int digit2 = 0;
6        while(n > 0) {
7            int rem = n % 10;
8            if(rem >= digit1) {
9                digit2 = digit1;
10                digit1 = rem;
11            }
12            else if(rem > digit2) {
13                digit2 = rem;
14            }
15            n = n / 10;
16        }
17        return digit1 * digit2;
18    }
19}
20          