// Last updated: 7/14/2026, 1:55:38 PM
1// Largest Local Values in a Matrix
2class Solution {
3    public int[][] largestLocal(int[][] grid) {
4        int n = grid.length;
5        int res[][] = new int[n - 2][n - 2];
6        for(int i = 1 ; i < n - 1 ; i++) {
7            for(int j = 1 ; j < n - 1 ; j++) {
8                int temp = 0;
9                for(int k = i - 1 ; k <= i + 1 ; k++) {
10                    for(int l = j - 1 ; l <= j + 1 ; l++) {
11                        temp = Math.max(temp , grid[k][l]);
12                    }
13                }
14                res[i - 1][j - 1] = temp;
15            }
16        }
17        return res;
18    }
19}