// Last updated: 7/9/2026, 10:01:40 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0 , end = nums.length-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
           