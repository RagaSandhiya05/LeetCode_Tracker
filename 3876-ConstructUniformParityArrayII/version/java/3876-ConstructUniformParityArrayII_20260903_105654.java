// Last updated: 9/3/2026, 10:56:54 AM
1// Construct Uniform Parity Array II
2class Solution {
3    public boolean uniformArray(int[] nums1) {
4        int min = nums1[0];
5        int odd = 0;
6        for(int X : nums1) {
7            min = Math.min(min , X);
8            odd = odd | X & 1;
9        }
10        return (min & 1) == odd;
11    }
12}
13       