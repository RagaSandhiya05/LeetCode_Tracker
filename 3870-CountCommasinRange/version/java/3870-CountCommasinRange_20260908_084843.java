// Last updated: 9/8/2026, 8:48:43 AM
1// Count Commas in Range
2class Solution {
3    public int countCommas(int n) {
4        int count = 0;
5        for(int i = 0 ; i <= n ; i++) {
6            if(i >= 1000) {
7                count++;
8            }
9        }
10        return count;
11    }
12}