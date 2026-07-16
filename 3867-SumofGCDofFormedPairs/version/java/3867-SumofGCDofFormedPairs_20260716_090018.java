// Last updated: 7/16/2026, 9:00:18 AM
1// Sum of GCD of Formed Pairs
2class Solution {
3    private int gcd(int a , int b) { return b == 0 ? a : gcd(b , a % b);}
4    public long gcdSum(int[] nums) {
5        int max = 0;
6        for(int i = 0 ; i < nums.length ; i++) {
7            max = Math.max(max , nums[i]);
8            nums[i] = gcd(nums[i] , max);
9        }
10        Arrays.sort(nums);
11        long res = 0;
12        for(int i = 0 , j = nums.length - 1 ; i < j ; i++ , j--) 
13            res = res + gcd(nums[i] , nums[j]);
14            return res;
15    }
16}
17
18       