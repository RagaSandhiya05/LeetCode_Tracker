// Last updated: 7/9/2026, 9:48:19 AM
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] res = new int[nums.length];

        for(int i = 0;i<nums.length;i++){
            int index = (i + nums[i]) % nums.length;
            if(index < 0){
                index += nums.length;
            }
            res[i] = nums[index];
        }

        return res;
    }
}