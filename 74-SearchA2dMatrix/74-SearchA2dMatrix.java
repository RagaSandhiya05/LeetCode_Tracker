// Last updated: 7/9/2026, 10:01:10 AM
// Search a 2D Matrix
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        while(i < matrix.length && j >= 0) {
            if(matrix[i][j] == target) {
                return true;
            }
            else if(target > matrix[i][j]) {
                i++;
            }
            else {
                j--;
            }
        }
            return false;
        }
    }

           