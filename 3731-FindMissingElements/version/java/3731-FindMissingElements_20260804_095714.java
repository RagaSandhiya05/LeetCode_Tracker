// Last updated: 8/4/2026, 9:57:14 AM
1// Find Missing Elements
2class Solution {
3    public List<Integer> findMissingElements(int[] nums) {
4        Arrays.sort(nums);
5        List<Integer> result = new ArrayList<>();
6        for(int i = 0 ; i < nums.length - 1 ; i++) {
7            for(int val = nums[i] + 1 ; val < nums[i + 1] ; val++) {
8                result.add(val);
9            }
10        }
11        return result;
12    }
13}
14         