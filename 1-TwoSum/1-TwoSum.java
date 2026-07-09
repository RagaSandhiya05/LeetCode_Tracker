// Last updated: 7/9/2026, 10:02:28 AM
// Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++) {
            for(int j = i + 1 ; j < nums.length ; j++) {
                if(nums[j] == target - nums[i]) {
                    return new int[] {i , j};
                }
            }
        }
        return new int[] {};
    }
}
               