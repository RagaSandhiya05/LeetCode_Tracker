// Last updated: 9/8/2026, 2:53:38 PM
1// Teemo Attacking
2class Solution {
3    public int findPoisonedDuration(int[] timeSeries, int duration) {
4        int count = 0;
5        for(int i = 0 ; i < timeSeries.length - 1 ; i++) {
6            count = count + Math.min(duration , timeSeries[i + 1] - timeSeries[i]);
7        }
8        count = count + duration;
9        return count;
10    }
11}
12       