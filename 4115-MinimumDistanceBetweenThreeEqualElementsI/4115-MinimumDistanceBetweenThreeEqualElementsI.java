// Last updated: 7/9/2026, 9:46:15 AM
// Minimum Distance Between Three Equal Elements I
class Solution {
    public int minimumDistance(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++) {
            for(int j = i + 1 ; j < n ; j++) {
                if(nums[i] != nums[j]) {
                    continue;
                }
                for(int k = j + 1 ; k < n ; k++) {
                    if(nums[j] == nums[k]) {
                        ans = Math.min(ans , 2 * (k - i));
                        break;
                    }
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
                  