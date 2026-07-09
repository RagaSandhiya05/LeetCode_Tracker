// Last updated: 7/9/2026, 9:56:31 AM
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;
        for(int i = 0 ; i < nums.length ; i = i + 2) {
            maxSum += nums[i];
        }
        return maxSum;
    }
}
    