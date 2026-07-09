// Last updated: 7/9/2026, 9:57:07 AM
// Find All Duplicates in an Array
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> nums1 = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 1 ; i < nums.length ; i++) {
            if(nums[i] == nums[i - 1])
            nums1.add(nums[i]);
        }
        return nums1;     
    }
}