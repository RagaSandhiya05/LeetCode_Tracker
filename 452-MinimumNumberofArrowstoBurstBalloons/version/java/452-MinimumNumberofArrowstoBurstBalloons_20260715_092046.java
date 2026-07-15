// Last updated: 7/15/2026, 9:20:46 AM
1// Minimum Number of Arrows to Burst Balloons
2class Solution {
3    public int findMinArrowShots(int[][] points) {
4        int n = points.length;
5        if(n == 1)
6        return 1;
7        int count = 1;
8        Arrays.sort(points , (a , b) -> Integer.compare(a[1] , b[1]));
9        int CommonEndPoints = points[0][1];
10        for(int i = 1 ; i < n ; i++) {
11            int curr = points[i][0];
12            int CurrEndPoints = points[i][1];
13            if(CommonEndPoints < curr) {
14                CommonEndPoints = CurrEndPoints;
15                count++;
16            }
17        }
18        return count;
19    }
20}
21            