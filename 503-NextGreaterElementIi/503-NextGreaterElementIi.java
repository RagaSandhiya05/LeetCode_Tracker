// Last updated: 7/9/2026, 9:56:44 AM
// Next Greater Element II
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int NextGreaterElement[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            NextGreaterElement[i] = -1;
            for(int step = 1 ; step < n ; step++) {
                int index = (i + step) % n;
                if(nums[index] > nums[i]) {
                    NextGreaterElement[i] = nums[index];
                    break;
                }
            }
        }
        return NextGreaterElement;
    }
}