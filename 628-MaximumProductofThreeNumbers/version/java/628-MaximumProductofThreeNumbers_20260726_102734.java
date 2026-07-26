// Last updated: 7/26/2026, 10:27:34 AM
1// Maximum Product of Three Numbers
2class Solution {
3    public int maximumProduct(int[] nums) {
4        Arrays.sort(nums);
5        int n = nums.length;
6        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
7        int product2 = nums[n - 1] * nums[0] * nums[1];
8        return Math.max(product1 , product2);
9    }
10}