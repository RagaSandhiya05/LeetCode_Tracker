// Last updated: 8/24/2026, 9:13:54 AM
1// Richest Customer Wealth
2class Solution {
3    public int maximumWealth(int[][] accounts) {
4        int rich = 0;
5        for(int i[] : accounts) {
6            int sum = 0;
7            for(int money : i) {
8                sum = sum + money;
9            }
10            rich = Math.max(rich , sum);
11        }
12        return rich;
13    }
14}
15           