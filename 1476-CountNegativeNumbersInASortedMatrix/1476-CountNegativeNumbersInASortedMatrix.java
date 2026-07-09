// Last updated: 7/9/2026, 9:54:33 AM
class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int row = 0;
        int col = n-1;
        int count = 0;
        while(row < m && col >= 0){
            if(grid[row][col] < 0){
                count = count + (m - row);
                col--;
            }
            else {
                row++;
            }
        }
        return count;
    }
}
         