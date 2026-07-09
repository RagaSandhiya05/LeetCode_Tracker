// Last updated: 7/9/2026, 9:55:23 AM
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = n - 1 ; i >= 2 ; i--){
            int a = nums[i - 2];
            int b = nums[i - 1];
            int c = nums[i];
            if(a + b > c){
                return a + b + c;
            }
        }
        return 0;
    }
}
           