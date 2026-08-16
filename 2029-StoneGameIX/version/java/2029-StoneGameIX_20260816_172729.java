// Last updated: 8/16/2026, 5:27:29 PM
1// Stone Game IX
2class Solution {
3    public boolean stoneGameIX(int[] stones) {
4        int count[] = new int[3];
5        for(int stone : stones) {
6            count[stone % 3]++;
7        }
8        if(count[0] % 2 == 0) {
9            return count[1] > 0 && count[2] > 0;
10        }
11        return Math.abs(count[1] - count[2]) > 2;
12    }
13}
14       