// Last updated: 9/7/2026, 4:13:44 PM
1// Unique Paths II
2public class Solution {
3    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
4        if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0 || obstacleGrid[0][0] == 1) {
5            return 0;
6        }
7
8        int m = obstacleGrid.length;
9        int n = obstacleGrid[0].length;
10
11        int[] previous = new int[n];
12        int[] current = new int[n];
13        previous[0] = 1;
14
15        for (int i = 0; i < m; i++) {
16            current[0] = obstacleGrid[i][0] == 1 ? 0 : previous[0];
17            for (int j = 1; j < n; j++) {
18                current[j] = obstacleGrid[i][j] == 1 ? 0 : current[j-1] + previous[j];
19            }
20            System.arraycopy(current, 0, previous, 0, n);
21        }
22
23        return previous[n-1];
24    }
25}