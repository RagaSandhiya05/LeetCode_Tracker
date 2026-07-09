// Last updated: 7/9/2026, 9:50:21 AM
// Construct Product Matrix
class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        final int MOD = 12345;
        int n = grid.length;
        int m = grid[0].length;
        int p[][] = new int[n][m];
        long suffix = 1;
        for(int i = n - 1 ; i >= 0 ; i--) {
            for(int j = m - 1 ; j >= 0 ; j--) {
                p[i][j] = (int) suffix;
                suffix = (suffix * grid[i][j]) % MOD;
            }
        }
        long prefix = 1;
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                p[i][j] = (int) (((long) p[i][j] * prefix) % MOD);
                prefix = (prefix * grid[i][j]) % MOD;
            }
        }
        return p;
    }
}
           