// Last updated: 9/24/2026, 1:36:54 PM
1// Smallest Index With Digit Sum Equal to Index
2class Solution {
3    public int smallestIndex(int[] nums) {
4        for(int i = 0 ; i < nums.length ; i++) {
5            int x = nums[i];
6            int sum = 0;
7            while(x > 0) {
8                sum = sum + x % 10;
9                x = x / 10;
10            }
11            if(sum == i)
12            return i;
13        }
14        return -1;
15    }
16}
17
18           