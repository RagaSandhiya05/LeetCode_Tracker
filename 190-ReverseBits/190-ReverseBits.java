// Last updated: 7/9/2026, 9:58:40 AM
// Reverse Bits
class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for(int i = 0 ; i < 32 ; i++) {
            res <<= 1;
            res |= (n & 1);
            n >>= 1;
        }
        return res;
    }
}
       