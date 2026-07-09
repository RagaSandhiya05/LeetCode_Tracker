// Last updated: 7/9/2026, 9:51:27 AM
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 1;
        int mn = nums[0];
        for(int i = 1 ; i < nums.length ; ++i)
        if(mn + k < nums[i]) {
            ++ans;
            mn = nums[i];
        }
        return ans;
        
    }
}