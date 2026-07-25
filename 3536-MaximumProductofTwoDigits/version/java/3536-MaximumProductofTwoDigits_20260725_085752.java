// Last updated: 7/25/2026, 8:57:52 AM
1class Solution {
2    public int maxProduct(int n) {
3        int digit1 = 0;
4        int digit2 = 0;
5        while(n > 0) {
6            int rem = n % 10;
7            if(rem >= digit1) {
8                digit2 = digit1;
9                digit1 = rem;
10            }
11            else if(rem > digit2) {
12                digit2 = rem;
13            }
14            n = n / 10;
15        }
16        return digit1 * digit2;
17    }
18}
19          