// Last updated: 8/11/2026, 8:53:57 AM
1// Smallest Missing Integer Greater Than Sequential Prefix Sum
2class Solution {
3    public int missingInteger(int[] nums) {
4        int n = nums.length;
5        Set<Integer> seen = new HashSet<>(n);
6        for(int num : nums)
7        seen.add(num);
8        int sum = nums[0];
9        for(int i = 1 ; i < n ; i++) {
10            if(nums[i] == nums[i - 1] + 1)
11            sum = sum + nums[i];
12            else 
13            break;
14        }
15        while(seen.contains(sum))
16        sum++;
17        return sum;
18    }
19}
20
21      