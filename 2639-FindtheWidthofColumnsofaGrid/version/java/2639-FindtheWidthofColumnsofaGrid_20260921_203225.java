// Last updated: 9/21/2026, 8:32:25 PM
1// Find the Width of Columns of a Grid
2class Solution {
3    public int[] findColumnWidth(int[][] grid) {
4        int M = grid.length;
5        int N = grid[0].length;
6        int ans[] = new int[N];
7        for(int i = 0 ; i < N ; i++) {
8            int max = 0;
9            for(int j = 0 ; j < M ; j++) {
10                max = Math.max(max , String.valueOf(grid[j][i]).length());
11            }
12            ans[i] = max;
13        }
14        return ans;
15    }
16}
17           