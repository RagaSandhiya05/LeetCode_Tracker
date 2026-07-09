// Last updated: 7/9/2026, 10:01:26 AM
// Jump Game
class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length -1;
        for(int i = nums.length - 1 ; i >= 0 ; i--) {
            if(i + nums[i] >= goal) {
                goal = i;
            }
        }
        return goal == 0;
    }
}
