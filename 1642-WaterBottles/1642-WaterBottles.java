// Last updated: 7/9/2026, 9:54:03 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = 0,empty=0,extra=0;
        while(numBottles > 0) {
            ans += numBottles;
            empty = numBottles + extra;
            numBottles = empty / numExchange;
            extra = empty % numExchange;
        }
        return ans;
    }
}