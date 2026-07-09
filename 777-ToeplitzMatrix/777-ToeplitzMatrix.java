// Last updated: 7/9/2026, 9:56:05 AM
// Toeplitz Matrix
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i = 1 ; i < rows ; i++) {
            for(int j = 1 ; j < cols ; j++) {
                if(matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
                