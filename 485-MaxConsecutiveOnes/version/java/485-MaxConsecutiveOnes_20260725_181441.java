// Last updated: 7/25/2026, 6:14:41 PM
1// Max Consecutive Ones
2class Solution {
3    public int findMaxConsecutiveOnes(int[] nums) {
4        int count = 0;
5        int max = 0;
6        for(int i = 0 ; i < nums.length ; i++) {
7            if(nums[i] == 1) {
8                count++;
9            }
10            else{
11                count = 0;
12            }
13            max = Math.max(max , count);
14        }
15        return max;
16    }
17}
18           