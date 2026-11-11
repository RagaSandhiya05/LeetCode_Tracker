// Last updated: 11/11/2026, 3:36:53 PM
1// Minimum Cost to Acquire Required Items
2class Solution {
3    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
4        long c1 = cost1;
5        long c2 = cost2;
6        long cb = costBoth;
7        long n1 = need1;
8        long n2 = need2;
9        long pairs = Math.min(n1 , n2);
10        long costPairs = pairs * Math.min(cb , c1 + c2);
11        long rem1 = n1 - pairs;
12        long rem2 = n2 - pairs;
13        long costRem = rem1 * Math.min(c1 , cb) + rem2 * Math.min(c2 , cb);
14        return costPairs + costRem;
15    }
16}