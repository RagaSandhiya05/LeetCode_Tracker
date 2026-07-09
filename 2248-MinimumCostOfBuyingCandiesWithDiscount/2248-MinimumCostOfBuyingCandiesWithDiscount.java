// Last updated: 7/9/2026, 9:51:54 AM
// Minimum Cost of Buying Candies With Discount
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans = 0 , len = cost.length - 1;
        while(len >= 0) {
            ans = ans + cost[len];
            if(len - 1 > -1) {
                ans = ans + cost[len - 1];
                len--;
            }
            len = len - 2;
        }
        return ans;
    }
}
           