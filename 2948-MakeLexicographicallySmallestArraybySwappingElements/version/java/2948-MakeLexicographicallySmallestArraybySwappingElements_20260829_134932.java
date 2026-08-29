// Last updated: 8/29/2026, 1:49:32 PM
1// Make Lexicographically Smallest Array by Swapping Elements
2class Solution {
3    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
4        int n = nums.length;
5
6        int[][] pairs = new int[n][2];
7
8        for (int i = 0; i < n; i++) {
9            pairs[i][0] = nums[i];
10            pairs[i][1] = i;
11        }
12
13        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
14
15        int start = 0;
16
17        while (start < n) {
18            int end = start;
19
20            while (end + 1 < n && (long) pairs[end + 1][0] - pairs[end][0] <= limit) {
21                end++;
22            }
23
24            int size = end - start + 1;
25            int[] indices = new int[size];
26
27            for (int i = 0; i < size; i++) {
28                indices[i] = pairs[start + i][1];
29            }
30
31            Arrays.sort(indices);
32
33            for (int i = 0; i < size; i++) {
34                nums[indices[i]] = pairs[start + i][0];
35            }
36
37            start = end + 1;
38        }
39
40        return nums;
41    }
42}