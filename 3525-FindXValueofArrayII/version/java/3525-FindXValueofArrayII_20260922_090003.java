// Last updated: 9/22/2026, 9:00:03 AM
1// Find X Value of Array II
2class Solution {
3    private static class Info {
4        int ways[];
5        int whole;
6        Info(int k) {
7            ways = new int[k];
8            whole = 1;
9        }
10    }
11    private static class SegmentTree {
12        int size;
13        int mod;
14        Info tree[];
15        SegmentTree(int nums[] , int k) {
16            mod = k;
17            size = 1;
18            while(size < nums.length) {
19                size <<= 1;
20            }
21            tree = new Info[size * 2];
22            for(int i = 0 ; i < tree.length ; i++) {
23                tree[i] = new Info(k);
24            }
25            for(int i = 0 ; i < nums.length ; i++) {
26                int rem = nums[i] % k;
27                tree[size + i].ways[rem] = 1;
28                tree[size + i].whole = rem;
29            }
30            for(int i = size - 1 ; i > 0 ; i--) {
31                tree[i] = combine(tree[i << 1] , tree[i << 1 | 1]);
32            }
33        }
34        private Info combine(Info left, Info right) {
35            Info merged = new Info(mod);
36            for (int r = 0; r < mod; r++) {
37                merged.ways[r] = left.ways[r];
38            }
39            for (int r = 0; r < mod; r++) {
40                if (right.ways[r] == 0) {
41                    continue;
42                }
43                int newRem = (left.whole * r) % mod;
44                merged.ways[newRem] += right.ways[r];
45            }
46            merged.whole = (left.whole * right.whole) % mod;
47            return merged;
48        }
49        void update(int index, int value) {
50            int pos = size + index;
51            int rem = value % mod;
52            Arrays.fill(tree[pos].ways, 0);
53            tree[pos].ways[rem] = 1;
54            tree[pos].whole = rem;
55            pos >>= 1;
56            while (pos > 0) {
57                tree[pos] = combine(
58                    tree[pos << 1],
59                    tree[pos << 1 | 1]
60                );
61                pos >>= 1;
62            }
63        }
64        Info query(int left, int right) {
65            Info leftPart = new Info(mod);
66            Info rightPart = new Info(mod);
67            left += size;
68            right += size;
69            while (left < right) {
70                if ((left & 1) != 0) {
71                    leftPart = combine(leftPart, tree[left]);
72                    left++;
73                }
74                if ((right & 1) != 0) {
75                    right--;
76                    rightPart = combine(tree[right], rightPart);
77                }
78                left >>= 1;
79                right >>= 1;
80            }
81            return combine(leftPart, rightPart);
82        }
83    }
84     public int[] resultArray(int[] nums, int k, int[][] queries) {
85        SegmentTree tree = new SegmentTree(nums, k);
86        int answer[] = new int[queries.length];
87        for(int i = 0 ; i < queries.length ; i++) {
88            int index = queries[i][0];
89            int value = queries[i][1];
90            int start = queries[i][2];
91            int x = queries[i][3];
92            tree.update(index, value);
93            Info result = tree.query(start, nums.length);
94            answer[i] = result.ways[x];
95        }
96        return answer;
97    }
98}
99       