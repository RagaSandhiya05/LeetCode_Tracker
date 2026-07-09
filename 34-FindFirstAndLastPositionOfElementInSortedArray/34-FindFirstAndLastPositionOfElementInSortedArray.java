// Last updated: 7/9/2026, 10:01:41 AM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{lowerLimit(nums,target),
        upperLimit(nums,target)};
    }
    public int lowerLimit(int[] nums , int target){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] < target)
            start = mid+1;
            else if(nums[mid] > target)
            end = mid - 1;
            else{
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }
    public int upperLimit(int[] nums , int target){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] < target)
            start = mid+1;
            else if(nums[mid] > target)
            end=mid-1;
            else {
                ans = mid;
                start = mid+1;      
        }
    }
        return ans;
    }
}
