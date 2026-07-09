// Last updated: 7/9/2026, 9:59:11 AM
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int k = 0;
        for(int i = 0 ; i < n ; i++) {
            int flag = 0;
            for(int j = 0 ; j < n ; j++) {
                if(i != j && nums[i] == nums[j]) {
                    flag = 1;
                    break;
                }
                else if(i != j && nums[i] != nums[j]) {
                    continue;
                }
            }
            if(flag == 0)
            return nums[i];
        }
        return -1;
    }
}
            
