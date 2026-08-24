// Last updated: 8/24/2026, 8:58:27 AM
1// Stone Game VIII
2class Solution {
3    public int stoneGameVIII(int[] stones) {
4        int N = stones.length;
5        for(int i = 1 ; i < N ; i++) {
6            stones[i] = stones[i] + stones[i - 1];
7        }
8        int best = stones[N - 1];
9        for(int i = N - 2 ; i >= 1 ; i--) {
10            best = Math.max(
11                best , 
12                stones[i] - best
13            );
14        }
15        return best;
16    }
17}
18          