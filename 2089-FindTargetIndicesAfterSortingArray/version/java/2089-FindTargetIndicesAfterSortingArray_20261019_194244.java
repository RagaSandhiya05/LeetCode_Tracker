// Last updated: 10/19/2026, 7:42:44 PM
1// Find Target Indices After Sorting Array
2class Solution {
3    public List<Integer> targetIndices(int[] nums, int target) {
4        int less = 0, equal = 0;
5        for (int x : nums) {
6            if (x < target) less++;
7            else if (x == target) equal++;
8        }
9        List<Integer> ans = new ArrayList<>();
10        for (int i = 0; i < equal; i++) {
11            ans.add(less + i);
12        }
13        return ans;
14    }
15}