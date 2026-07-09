// Last updated: 7/9/2026, 10:01:51 AM
// Remove Element
class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
           