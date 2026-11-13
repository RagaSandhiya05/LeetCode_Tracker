// Last updated: 11/13/2026, 9:55:59 PM
1// Count Non-Decreasing Subarrays After K Operations
2class Solution {
3    public long countNonDecreasingSubarrays(int[] nums, int k) {
4        int n = nums.length;
5        int[] val = new int[n];
6        int[] cnt = new int[n];
7        int head = 0, tail = -1;
8        int j = n - 1;
9        long cost = 0, ans = 0;
10        for (int i = n - 1; i >= 0; i--) {
11            int c = 1;
12            while (tail >= head && val[tail] < nums[i]) {
13                cost += (long) (nums[i] - val[tail]) * cnt[tail];
14                c += cnt[tail];
15                tail--;
16            }
17            tail++;
18            val[tail] = nums[i];
19            cnt[tail] = c;
20            while (cost > k) {
21                cost -= val[head] - nums[j];
22                if (--cnt[head] == 0) head++;
23                j--;
24            }
25            ans += j - i + 1;
26        }
27        return ans;
28    }
29}