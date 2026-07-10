// Last updated: 7/10/2026, 1:51:20 PM
1// Path Existence Queries in a Graph II
2class Solution {
3    public int[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
4        int LOG = 18;
5        int[][] vec = new int[n][2];
6        for (int i = 0; i < n; i++) {
7            vec[i][0] = nums[i];
8            vec[i][1] = i;
9        }
10        Arrays.sort(vec, (a, b) -> {
11            if (a[0] != b[0]) 
12                return Integer.compare(a[0], b[0]);
13            return Integer.compare(a[1], b[1]);
14        });
15        int[] getSortIdx = new int[n];
16        for (int i = 0; i < n; i++) {
17            getSortIdx[vec[i][1]] = i;
18        }
19        int[][] st = new int[n][LOG];
20        int l = 0;
21        for (int r = 0; r < n; r++) {
22            while (vec[r][0] - vec[l][0] > maxDiff) {
23                st[l][0] = r - 1;
24                l++;
25            }
26        }
27        while (l < n) {
28            st[l][0] = n - 1;
29            l++;
30        }
31        for (int j = 1; j < LOG; j++) {
32            for (int i = 0; i < n; i++) {
33                st[i][j] = st[st[i][j - 1]][j - 1];
34            }
35        }
36        int[] ans = new int[queries.length];
37        Arrays.fill(ans, -1);
38        for (int i = 0; i < queries.length; i++) {
39            int a = getSortIdx[queries[i][0]];
40            int b = getSortIdx[queries[i][1]];
41            if (a > b) {
42                int temp = a;
43                a = b;
44                b = temp;
45            }
46            if (a == b) {
47                ans[i] = 0;
48                continue;
49            }
50            int cur = a;
51            int step = 0;
52            for (int j = LOG - 1; j >= 0; j--) {
53                if (st[cur][j] < b) {
54                    step += 1 << j;
55                    cur = st[cur][j];
56                }
57            }
58            if (st[cur][0] >= b) {
59                ans[i] = step + 1;
60            }
61        }
62        return ans;
63    }
64}