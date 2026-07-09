// Last updated: 7/9/2026, 9:53:17 AM
// Sum of Unique Elements
class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++) {
            max = Math.max(max , nums[i]);
        }
        int count[] = new int[max + 1];
        for(int i = 0 ; i < nums.length ; i++) {
            count[nums[i]]++;
        }
        for(int i = 0 ; i < count.length ; i++) {
            if(count[i] == 1) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
           