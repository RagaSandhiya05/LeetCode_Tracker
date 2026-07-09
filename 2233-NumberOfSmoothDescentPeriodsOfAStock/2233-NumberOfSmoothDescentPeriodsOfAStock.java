// Last updated: 7/9/2026, 9:51:59 AM
class Solution {
    public long getDescentPeriods(int[] prices) {
        int left = 0;
        int right = 1;
        int n = prices.length;
        long ans = n;
        while(right < n){
            if(prices[right - 1] - prices[right] == 1){
                ans = ans + (right - left);
            }
            else {
                left = right;
            }
            right++;
        }
        return ans;
    }
}
           