// Last updated: 7/9/2026, 9:53:00 AM
// Maximum Ice Cream Bars
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ans = 0;
        for(int cost : costs) {
            if(cost > coins)
            break;
            ans++;
            coins = coins - cost;
        }
        return ans;
    }
}