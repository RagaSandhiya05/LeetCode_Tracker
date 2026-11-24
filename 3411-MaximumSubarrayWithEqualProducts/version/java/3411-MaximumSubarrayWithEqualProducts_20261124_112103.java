// Last updated: 11/24/2026, 11:21:03 AM
1// Maximum Subarray With Equal Products
2class Solution {
3    public int maxLength(int[] nums) {
4        int n = nums.length;
5        int ans = 0;
6        for (int i = 0; i < n; i++) {
7            int product = 1;
8            int gcd = 0;
9            int lcm = 1;
10            for (int j = i; j < n; j++) {
11                product *= nums[j];
12                gcd = findGCD(gcd, nums[j]);
13                lcm = (lcm / findGCD(lcm, nums[j])) * nums[j];
14                if (product == gcd * lcm) {
15                    ans = Math.max(ans, j - i + 1);
16                }
17            }
18        }
19        return ans;
20    }
21    private int findGCD(int a, int b) {
22        while (b != 0) {
23            int temp = b;
24            b = a % b;
25            a = temp;
26        }
27        return a;
28    }
29}
30