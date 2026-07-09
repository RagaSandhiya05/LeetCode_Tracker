// Last updated: 7/9/2026, 10:01:52 AM
// Remove Duplicates from Sorted Array
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1 ; j < nums.length ; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
          