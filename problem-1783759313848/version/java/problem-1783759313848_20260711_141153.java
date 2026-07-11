// Last updated: 7/11/2026, 2:11:53 PM
1// Row With Maximum Ones
2class Solution {
3    public int[] rowAndMaximumOnes(int[][] mat) {
4       int rows = mat.length;
5       int cols = mat[0].length;
6       int MaxOnes = 0;
7       int MaxRow = 0;
8       for(int i = 0 ; i < rows ; i++) {
9        int Ones = 0;
10        for(int j = 0 ; j < cols ; j++) {
11            if(mat[i][j] == 1)
12            Ones++;
13        }
14        if(Ones > MaxOnes) {
15            MaxOnes = Ones;
16            MaxRow = i;
17        }
18       }
19       return new int[]{MaxRow , MaxOnes};
20    }
21}
22        