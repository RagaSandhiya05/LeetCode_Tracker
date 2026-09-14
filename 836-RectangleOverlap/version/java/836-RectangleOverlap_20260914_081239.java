// Last updated: 9/14/2026, 8:12:39 AM
1// Rectangle Overlap
2class Solution {
3    public boolean isRectangleOverlap(int[] r1, int[] r2) {
4        return r1[0] < r2[2] && r2[0] < r1[2] &&
5               r1[1] < r2[3] && r2[1] < r1[3];
6    }
7}
8   