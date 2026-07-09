// Last updated: 7/9/2026, 9:51:22 AM
class Solution {
    public boolean checkXMatrix(int[][] grid) {
        for(int i = 0 ; i < grid.length ; i++) {
            for(int j = 0 ; j < grid[0].length ; j++) {
                if((i == j || (grid.length - i - 1) == j)) {
                    if(grid[i][j] == 0) {
                        return false;
                    }
                }
                    else {
                        if(grid[i][j] != 0) {
                            return false;
                        }
                    }
                }
            }
            return true;
    }
}