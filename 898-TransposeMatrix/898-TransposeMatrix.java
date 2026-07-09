// Last updated: 7/9/2026, 9:55:45 AM
// Transpose Matrix
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int TransposeMat[][] = new int[n][m];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                TransposeMat[i][j] = matrix[j][i];
            }
        }
        return TransposeMat;
    }
}