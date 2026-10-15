// Last updated: 10/15/2026, 8:44:17 AM
1// Subarrays Distinct Element Sum of Squares I
2class Solution {
3    public int sumCounts(List<Integer> nums) {
4        int N = nums.size();
5        int res = 0;
6        for(int i = 0 ; i < N ; i++) {
7            Set<Integer> set = new HashSet<>();
8            for(int j = i ; j < N ; j++) {
9                set.add(nums.get(j));
10                int M = set.size();
11                res = res + (M * M);
12            }
13        }
14        return res;
15    }
16}
17           