// Last updated: 10/12/2026, 11:13:28 AM
1// Apply Operations on Array to Maximize Sum of Squares
2class Solution {
3    public int maxSum(List<Integer> nums, int k) {
4        int[] count = new int[32];
5        int mod = (int) (1e9 + 7);
6        for (int num : nums){
7            for (int i = 0; i < 32; ++i)
8                count[i] += num >> i & 1;   
9        }
10        long ans = 0;
11        for (int i = 0; i < k; ++i){
12            int c = 0;
13            for (int j = 0; j < 32; ++j){
14                if (count[j] == 0) continue;
15                c |= 1 << j;
16                --count[j];
17            }
18            ans = (ans + 1L * c * c) % mod;
19        }
20        return (int) ans;
21    }
22}