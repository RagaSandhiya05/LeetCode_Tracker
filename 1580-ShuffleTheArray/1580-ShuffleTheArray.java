// Last updated: 7/9/2026, 9:54:16 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int index = 0;
        for(int i = 0 ; i < n ; i++) {
            ans[index] = nums[i];
            ans[index + 1] = nums[i + n];
            index += 2;
        }
        return ans;
        }
}
