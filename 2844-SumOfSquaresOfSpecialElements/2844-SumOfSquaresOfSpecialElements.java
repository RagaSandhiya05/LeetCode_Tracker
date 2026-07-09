// Last updated: 7/9/2026, 9:50:44 AM
// Sum of Squares of Special Elements
class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i = 1 ; i <= n ; i++) {
            int num = nums[i - 1];
            if(n % i == 0){
                sum = sum + num * num;
            }
        }
        return sum;
    }
}
           