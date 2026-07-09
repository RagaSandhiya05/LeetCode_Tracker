// Last updated: 7/9/2026, 9:58:09 AM
// Move Zeroes 
class Solution {
    public void moveZeroes(int[] nums) {
        int a = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] != 0) {
                nums[a] = nums[i];
                a++;
            }
        }
        for(int i = a ; i < nums.length ; i++) {
            nums[i] = 0;
        }
    }
}
        