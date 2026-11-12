// Last updated: 11/12/2026, 3:47:36 PM
1// Longest Strictly Increasing or Strictly Decreasing Subarray
2class Solution {
3    public int longestMonotonicSubarray(int[] nums) {
4        int N = nums.length;
5        int MaxLen = 1;
6        int inc = 1;
7        int dec = 1;
8        for(int i = 1 ; i < N ; i++) {
9            if(nums[i] > nums[i - 1]) {
10                inc++;
11                dec = 1;
12            }
13            else if(nums[i] < nums[i - 1]) {
14                dec++;
15                inc = 1;
16            }
17            else {
18                inc = 1;
19                dec = 1;
20            }
21            MaxLen = Math.max(MaxLen, Math.max(inc , dec));
22        }
23        return MaxLen;
24    }
25}
26           