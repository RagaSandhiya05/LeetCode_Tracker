// Last updated: 7/9/2026, 9:50:08 AM
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] result = new int[nums.length/3][3];
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i+2] - nums[i] <= k) {
                result[i/3][0] = nums[i++];
                result[i/3][1] = nums[i++];
                result[i/3][2] = nums[i];
            } else {
                return new int[0][0];
            }
        }
        return result;
    }
}