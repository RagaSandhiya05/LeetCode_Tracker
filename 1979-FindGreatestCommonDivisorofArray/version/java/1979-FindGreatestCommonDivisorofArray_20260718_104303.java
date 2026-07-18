// Last updated: 7/18/2026, 10:43:03 AM
1// Find Greatest Common Divisor of Array
2class Solution {
3    private int gcd(int a , int b) {
4        while(b != 0) {
5            int temp = b;
6            b = a % b;
7            a = temp;
8        }
9        return a;
10    }
11    public int findGCD(int[] nums) {
12        int min = nums[0];
13        int max = nums[0];
14        for(int num : nums) {
15            min = Math.min(min , num);
16            max = Math.max(max , num);
17        }
18        return gcd(min , max);
19    }
20}
21        