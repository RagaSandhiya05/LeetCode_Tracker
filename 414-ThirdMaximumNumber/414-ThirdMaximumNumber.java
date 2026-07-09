// Last updated: 7/9/2026, 9:57:20 AM
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1 , prev = nums[nums.length - 1] , res = 0;
        for(int i = nums.length - 2 ; i >= 0 ; i--){
            if(prev != nums[i]) 
            count++;
            prev = nums[i];
            if(count == 3){
                res = nums[i];
                break;
            }
        }
        if(count != 3) return nums[nums.length - 1];
        return res;
    }
}
           