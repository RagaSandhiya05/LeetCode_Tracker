// Last updated: 7/9/2026, 9:56:22 AM
// Maximum Product of Three Numbers
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[n - 1] * nums[0] * nums[1];
        return Math.max(product1 , product2);
    }
}