// Last updated: 9/13/2026, 5:26:15 PM
1// Image Overlap
2class Solution {
3    public int largestOverlap(int[][] img1, int[][] img2) {
4        int n = img1.length;
5        int[][] shifts = new int[2 * n][2 * n];
6        int maxOverlap = 0;
7
8        for (int r1 = 0; r1 < n; r1++) {
9            for (int c1 = 0; c1 < n; c1++) {
10                if (img1[r1][c1] != 1) continue;
11
12                for (int r2 = 0; r2 < n; r2++) {
13                    for (int c2 = 0; c2 < n; c2++) {
14                        if (img2[r2][c2] != 1) continue;
15
16                        int rowShift = n + r1 - r2;
17                        int colShift = n + c1 - c2;
18
19                        shifts[rowShift][colShift]++;
20                        maxOverlap = Math.max(maxOverlap, shifts[rowShift][colShift]);
21                    }
22                }
23            }
24        }
25
26        return maxOverlap;
27    }
28}