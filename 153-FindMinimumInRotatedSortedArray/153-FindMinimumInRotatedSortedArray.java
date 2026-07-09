// Last updated: 7/9/2026, 9:59:05 AM
// Find Minimum in Rotated Sorted Array
class Solution {
    public int findMin(int[] nums) {
        int left = 0 , right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[right]) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
            