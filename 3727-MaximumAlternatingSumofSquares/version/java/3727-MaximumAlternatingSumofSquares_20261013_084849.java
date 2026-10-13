// Last updated: 10/13/2026, 8:48:49 AM
1// Maximum Alternating Sum of Squares 
2class Solution {
3    public long maxAlternatingSum(int[] nums) {
4        int N = nums.length;
5        long arr[] = new long[N];
6        for(int i = 0 ; i < N ; i++) {
7            arr[i] = (long) nums[i] * nums[i];
8        }
9        Arrays.sort(arr);
10        long ans = 0;
11        for(int i = 0 ; i < N ; i++) {
12            if(i < N / 2) {
13                ans = ans - arr[i];
14            }
15            else {
16                ans = ans + arr[i];
17            }
18        }
19        return ans;
20    }
21}
22           