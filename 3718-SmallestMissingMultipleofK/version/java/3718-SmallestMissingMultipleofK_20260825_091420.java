// Last updated: 8/25/2026, 9:14:20 AM
1// Smallest Missing Multiple of K
2class Solution {
3    public int missingMultiple(int[] nums, int k) {
4        Set<Integer> seen = new HashSet<>();
5        for(int num : nums) {
6            seen.add(num);
7        }
8        int curr = k;
9        while(seen.contains(curr)) {
10            curr = curr + k;
11        }
12        return curr;
13    }
14}
15       