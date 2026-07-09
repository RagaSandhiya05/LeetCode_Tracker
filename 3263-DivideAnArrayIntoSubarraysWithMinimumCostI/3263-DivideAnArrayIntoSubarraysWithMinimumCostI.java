// Last updated: 7/9/2026, 9:50:02 AM
class Solution {
    public int minimumCost(int[] nums) {
        int first = nums[0];
        int second = nums[1];
        int third = nums[2];
        for(int i = 3 ; i < nums.length ; i++){
            if(nums[i] <= third){
                if(third <= second){
                    second = third;
                }
                third = nums[i];
            }
            else if(nums[i] <= second){
                second = third;
                second = nums[i];
            }
        }
        return first + second + third;
    }
}
          