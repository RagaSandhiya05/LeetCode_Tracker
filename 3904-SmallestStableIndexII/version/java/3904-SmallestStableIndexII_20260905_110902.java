// Last updated: 9/5/2026, 11:09:02 AM
1// Smallest Stable Index II
2class Solution {
3    public int firstStableIndex(int[] nums, int k) {
4        int MaxSoFar = -1;
5        int Cand = 0;
6        int Max = 0;
7        for(int i = 0 ; i < nums.length ; i++) {
8            MaxSoFar = Math.max(MaxSoFar , nums[i]);
9            if(Cand == i) 
10            Max = MaxSoFar;
11            if(nums[i] < Max - k)
12            Cand = i + 1;
13        }
14        return Cand < nums.length ? Cand : -1;
15    }
16}
17        