// Last updated: 7/20/2026, 8:51:01 AM
1// Shift 2D Grid
2class Solution {
3    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
4        int m = grid.length;
5        int n = grid[0].length;
6        int changed[][] = new int[m][n];
7        for(int i = 0 ; i < m ; i++){
8            for(int j = 0 ; j < n ; j++) {
9                int curr = i * n + j;
10                int NewElement = (curr + k) % (m * n);
11                int row = NewElement / n;
12                int col = NewElement % n;
13                changed[row][col] = grid[i][j];
14            }
15        }
16        List<List<Integer>> result = new ArrayList<>();
17        for(int i = 0 ; i < m ; i++) {
18            List<Integer> temp = new ArrayList<>();
19            for(int j = 0 ; j < n ; j++) {
20                temp.add(changed[i][j]);
21            }
22            result.add(temp);
23        }
24        return result;
25    }
26}
27           