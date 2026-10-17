// Last updated: 10/17/2026, 1:32:05 PM
1// Minimum Swaps to Sort by Digit Sum
2class Solution {
3    public int minSwaps(int[] nums) {
4        int n = nums.length;
5        int[][] arr = new int[n][3];
6        for (int i = 0; i < n; i++) {
7            int curr = nums[i];
8            int digitSum = 0;
9            while (curr > 0) {
10                digitSum += curr % 10;
11                curr /= 10;
12            }
13            arr[i][0] = digitSum;
14            arr[i][1] = nums[i];
15            arr[i][2] = i;
16        }
17        Arrays.sort(arr, (a, b) -> {
18            if (a[0] != b[0]) {
19                return Integer.compare(a[0], b[0]);
20            }
21            if (a[1] != b[1]) {
22                return Integer.compare(a[1], b[1]);
23            }
24            return Integer.compare(a[2], b[2]);
25        });
26        int[] perm = new int[n];
27        for (int i = 0; i < n; i++) {
28            perm[i] = arr[i][2];
29        }
30        boolean[] visited = new boolean[n];
31        int cycles = 0;
32        for (int i = 0; i < n; i++) {
33            if (visited[i]) {
34                continue;
35            }
36            cycles++;
37            int j = i;
38            while (!visited[j]) {
39                visited[j] = true;
40                j = perm[j];
41            }
42        }
43        return n - cycles;
44    }
45}