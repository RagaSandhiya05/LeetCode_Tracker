// Last updated: 7/9/2026, 9:58:53 AM
// Majority Element
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    }
}