// Last updated: 9/4/2026, 11:26:32 AM
1// Smallest Stable Index 1
2class Solution {
3    public int firstStableIndex(int[] nums, int k) {
4        int N = nums.length;
5        int SuffixMin[] = new int[N];
6        SuffixMin[N - 1] = nums[N - 1];
7        for(int i = N - 2 ; i >= 0 ; i--) {
8            SuffixMin[i] = Math.min(nums[i] , SuffixMin[i + 1]);
9        }
10        int PrefixMax = nums[0];
11        for(int i = 0 ; i < N ; i++) {
12            PrefixMax = Math.max(PrefixMax , nums[i]);
13            int instability = PrefixMax - SuffixMin[i];
14            if(instability <= k) {
15                return i;
16            }
17        }
18        return -1;
19    }
20}
21           