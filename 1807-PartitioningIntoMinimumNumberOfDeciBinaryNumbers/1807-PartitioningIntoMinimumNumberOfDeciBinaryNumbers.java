// Last updated: 7/9/2026, 9:53:31 AM
// Partitioning Into Minimum Number Of Deci-Binary Numbers
class Solution {
    public int minPartitions(String n) {
        int ans = 0;
        for(int i = 0 ; i < n.length() ; i++) {
            ans = Math.max(ans , n.charAt(i) - '0');
        }
        return ans;
    }
}
       