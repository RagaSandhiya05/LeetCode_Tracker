// Last updated: 7/9/2026, 9:46:30 AM
// Minimum Operations to Equalize Array
class Solution {
    public int minOperations(int[] nums) {
        for(int i = 1 ; i < nums.length ; i++) {
            if(nums[i] != nums[i - 1]) 
                return 1;
        }
            return 0;
    }
}