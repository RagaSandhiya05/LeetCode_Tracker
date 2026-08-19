// Last updated: 8/19/2026, 2:07:09 PM
1// Cinema Seat Allocation
2import java.util.HashMap;
3import java.util.Map;
4public class Solution {
5    public int maxNumberOfFamilies(int n , int reservedSeats[][]) {
6        Map<Integer , Integer> graph = new HashMap<>();
7        for(int seat[] : reservedSeats) {
8            int row = seat[0];
9            int col = seat[1];
10            if(col >= 2 && col <= 9) {
11                int mask = graph.getOrDefault(row , 0);
12                mask |= (1 << (col - 2));
13                graph.put(row , mask);
14            }
15        }
16        int maxFamilies = 2 * n;
17        for(int mask : graph.values()) {
18            boolean left = (mask & 15) == 0;
19            boolean right = (mask & 240) == 0;
20            boolean mid = (mask & 60) == 0;
21            maxFamilies = maxFamilies - 2;
22            if(left && right) {
23                maxFamilies = maxFamilies + 2;
24            }
25            else if(left || right || mid) {
26                maxFamilies = maxFamilies + 1;
27            }
28        }
29        return maxFamilies;
30    }
31}