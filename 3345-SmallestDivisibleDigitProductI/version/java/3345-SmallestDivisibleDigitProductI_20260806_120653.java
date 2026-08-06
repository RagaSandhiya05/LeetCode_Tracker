// Last updated: 8/6/2026, 12:06:53 PM
1// Smallest Divisible Digit Product I
2class Solution {
3    public int smallestNumber(int n, int t) {
4        while(true) {
5            int product = 1;
6            int x = n;
7            while(x > 0) {
8                product = product * (x % 10);
9                x = x / 10;
10            }
11            if(product % t == 0)
12            return n;
13            n++;
14        }
15    }
16}
17           