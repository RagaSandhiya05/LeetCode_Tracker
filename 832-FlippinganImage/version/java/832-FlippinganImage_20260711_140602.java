// Last updated: 7/11/2026, 2:06:02 PM
1// Flipping an Image
2class Solution {
3    public int[][] flipAndInvertImage(int[][] image) {
4        for(int i = 0 ; i < image.length ; i++) {
5            for(int j = 0 , k = image[i].length - 1 ; j <= k ; j++ , k--) {
6                int temp = image[i][k];
7                image[i][k] = 1 - image[i][j];
8                image[i][j] = 1 - temp;
9            }
10        }
11        return image;
12    }
13}
14          