// Last updated: 7/14/2026, 2:04:37 PM
1// Prime In Diagonal
2class Solution {
3    public int diagonalPrime(int[][] nums) {
4        int len = nums.length;
5        int max = 0;
6        for(int i = 0 ; i < len ; i++) {
7            int main = nums[i][i];
8            int secondary = nums[i][len - 1 - i];
9            if(main > max && isPrime(main)) {
10                max = main;
11            }
12            if(secondary > max && isPrime(secondary)) {
13                max = secondary;
14            }
15        }
16        return max;
17    }
18    private boolean isPrime(int n) {
19        if(n <= 1) {
20            return false;
21        }
22        for(int i = 2 ; i * i <= n ; i++) {
23            if(n % i == 0) {
24                return false;
25            }
26        }
27        return true;
28    }
29}
30           