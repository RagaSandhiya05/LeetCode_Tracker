// Last updated: 8/15/2026, 2:49:33 PM
1// Longest Subsequence With Non-Zero Bitwise XOR
2class Solution {
3    public int longestSubsequence(int[] A) {
4        int tot = 0;
5        int n = A.length;
6        boolean nonZero = false;
7        for (int x : A) {
8            nonZero |= x > 0;
9            tot ^= x;
10        }
11        if (!nonZero) return 0;
12        return tot == 0 ? n - 1 : n;
13    }
14}