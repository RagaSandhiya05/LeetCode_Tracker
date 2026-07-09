// Last updated: 7/9/2026, 9:57:10 AM
class Solution {
    public int findKthNumber(int n, int k) {
        long prefix = 1;
        k--;
        while(k>0) {
            long subtSize = 0;
            long curr = prefix;
            long next = prefix + 1;
            while(curr <= n) {
                subtSize += Math.min(n+1 , next) - curr;
                curr *= 10;
                next *= 10;
            }
            if(subtSize <= k) {
                prefix++;
                k -= subtSize;
            } else {
                prefix *= 10;
                k--;
            }
        }
        return (int) prefix;
    }
}