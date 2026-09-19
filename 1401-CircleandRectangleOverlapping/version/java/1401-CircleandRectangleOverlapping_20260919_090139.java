// Last updated: 9/19/2026, 9:01:39 AM
1// Circle and Rectangle Overlapping
2class Solution {
3    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
4        int closestX = Math.max(x1, Math.min(xCenter, x2));
5        int closestY = Math.max(y1, Math.min(yCenter, y2));
6        int dx = closestX - xCenter;
7        int dy = closestY - yCenter;
8        return (long)dx * dx + (long)dy * dy <= (long)radius * radius;
9    }
10}
11    