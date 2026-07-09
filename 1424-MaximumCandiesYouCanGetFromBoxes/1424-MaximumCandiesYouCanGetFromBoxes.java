// Last updated: 7/9/2026, 9:54:51 AM
class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int n = keys.length;
        boolean[] open = new boolean[n];
        for(int i = 0; i < n; i++){
            if(status[i] == 1) open[i] = true;
        }
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for(int box : initialBoxes) {
            q.offer(new int[]{ box,(open[box]) ? 1 : 0});
        }
        int total = 0;
        while(!q.isEmpty())  {
            int[] curr = q.poll();
            int node = curr[0] , opened = curr[1];
            if(open[node]) total += candies[node];
            for(int key : keys[node]) {
                open[key] = true;
            }
            for(int box : containedBoxes[node]) {
                q.offer(new int[] { box,(open[box]) ? 1 : 0});
            }
        }
        return total;
    }
}