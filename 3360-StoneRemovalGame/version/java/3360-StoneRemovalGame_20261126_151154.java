// Last updated: 11/26/2026, 3:11:54 PM
1// Stone Removal Game
2class Solution {
3    public boolean canAliceWin(int n) {
4        int remove = 10;
5        boolean aliceTurn = true;
6        while(n >= remove) {
7            n = n - remove;
8            remove--;
9            aliceTurn = !aliceTurn;
10        }
11        return !aliceTurn;
12    }
13}