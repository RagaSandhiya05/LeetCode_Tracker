// Last updated: 8/12/2026, 8:53:46 AM
1// Length of Longest Subarray With at Most K Frequency
2class Solution {
3    public int maxSubarrayLength(int[] nums, int k) {
4        int left = 0;
5        int res = 0;
6        Map<Integer , Integer> count = new HashMap<>();
7        int n = nums.length;
8        for(int i = 0 ; i < n ; i++) {
9            count.put(
10                nums[i] , 
11                count.getOrDefault(nums[i] , 0) + 1
12            );
13            while(count.get(nums[i]) > k) {
14                count.put(
15                    nums[left] , 
16                    count.get(nums[left]) - 1
17                );
18                left++;
19            }
20            res = Math.max(res , i - left + 1);
21        }
22        return res;
23    }
24}
25           