// Last updated: 7/9/2026, 9:53:53 AM
// Sum of All Odd Length Subarrays
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++)
        sum = sum + (arr[i] * ((((i + 1) * (arr.length - i)) + 1) / 2));
        return sum;
    }
}