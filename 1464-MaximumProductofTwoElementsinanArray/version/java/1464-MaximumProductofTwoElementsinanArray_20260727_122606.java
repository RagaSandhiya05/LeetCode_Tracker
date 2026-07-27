// Last updated: 7/27/2026, 12:26:06 PM
1// Maximum Product of Two Elements in an Array
2class Solution {
3    public int maxProduct(int[] nums) {
4        int first = 0;
5        int second = 0;
6        for(int num : nums) {
7            if(num >= first) {
8                second = first;
9                first = num;
10            }
11            else if(num > second) {
12                second = num;
13            }
14        }
15        return (first - 1) * (second - 1);
16    }
17}
18           