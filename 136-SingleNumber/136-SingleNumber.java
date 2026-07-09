// Last updated: 7/9/2026, 9:59:13 AM
// Single Number
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
    