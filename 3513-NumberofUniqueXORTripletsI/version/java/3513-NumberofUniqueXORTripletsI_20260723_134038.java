// Last updated: 7/23/2026, 1:40:38 PM
1class Solution {
2    public int uniqueXorTriplets(int[] nums) {
3        int n = nums.length;
4        if(n <= 2)
5        return n;
6        int mask = 0;
7        for(int num : nums) {
8            mask |= num;
9        }
10        return mask + 1;
11    }
12}
13        