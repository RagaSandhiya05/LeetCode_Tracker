// Last updated: 7/9/2026, 9:59:35 AM
// Best Time to Buy and Sell Stock II
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1 ; i < prices.length ; i++) {
            if(prices[i] > prices[i - 1]) {
                profit = profit + prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
           