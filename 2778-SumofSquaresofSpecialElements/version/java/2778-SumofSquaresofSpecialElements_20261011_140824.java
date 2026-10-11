// Last updated: 10/11/2026, 2:08:24 PM
1// Sum of Squares of Special Elements
2class Solution {
3    public int sumOfSquares(int[] nums) {
4        int sum = 0;
5        int n = nums.length;
6        for(int i = 1 ; i <= n ; i++) {
7            int num = nums[i - 1];
8            if(n % i == 0){
9                sum = sum + num * num;
10            }
11        }
12        return sum;
13    }
14}
15           