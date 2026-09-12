// Last updated: 9/12/2026, 8:50:49 AM
1// Maximum Score of Non-overlapping Intervals
2class Solution {
3    static class Pair {
4        long sum;
5        List<Integer> ids;
6        Pair(long sum, List<Integer> ids) {
7            this.sum = sum;
8            this.ids = ids;
9        }
10        Pair copy() {
11            return new Pair(sum, new ArrayList<>(ids));
12        }
13    }
14    Pair[][] dp;
15    int[] next;
16    Pair better(Pair a, Pair b) {
17        if (a.sum != b.sum)
18            return a.sum > b.sum ? a : b;
19        Collections.sort(a.ids);
20        Collections.sort(b.ids);
21        for (int i = 0; i < Math.min(a.ids.size(), b.ids.size()); i++) {
22            if (!a.ids.get(i).equals(b.ids.get(i)))
23                return a.ids.get(i) < b.ids.get(i) ? a : b;
24        }
25        return a.ids.size() <= b.ids.size() ? a : b;
26    }
27    int lowerBound(List<List<Integer>> in, List<Integer> order, int target) {
28        int l = 0, r = order.size();
29        while (l < r) {
30            int m = l + (r - l) / 2;
31            if (in.get(order.get(m)).get(0) >= target)
32                r = m;
33            else
34                l = m + 1;
35        }
36        return l;
37    }
38    Pair solve(List<List<Integer>> in, List<Integer> order,
39               int pos, int count) {
40        if (pos == order.size() || count == 4)
41            return new Pair(0, new ArrayList<>());
42        if (dp[pos][count] != null)
43            return dp[pos][count].copy();
44        Pair skip = solve(in, order, pos + 1, count);
45        int id = order.get(pos);
46        Pair take = solve(
47            in,
48            order,
49            next[pos],
50            count + 1
51        );
52        take.sum += in.get(id).get(2);
53        take.ids.add(id);
54        dp[pos][count] = better(skip, take);
55        return dp[pos][count].copy();
56    }
57    public int[] maximumWeight(List<List<Integer>> intervals) {
58        int n = intervals.size();
59        List<Integer> order = new ArrayList<>();
60        for (int i = 0; i < n; i++)
61            order.add(i);
62        order.sort((a, b) ->
63            Integer.compare(
64                intervals.get(a).get(0),
65                intervals.get(b).get(0)
66            )
67        );
68        next = new int[n];
69        for (int i = 0; i < n; i++) {
70            int id = order.get(i);
71            next[i] = lowerBound(
72                intervals,
73                order,
74                intervals.get(id).get(1) + 1
75            );
76        }
77        dp = new Pair[n][4];
78        List<Integer> ans = solve(intervals, order, 0, 0).ids;
79        Collections.sort(ans);
80        int[] res = new int[ans.size()];
81        for (int i = 0; i < ans.size(); i++)
82            res[i] = ans.get(i);
83        return res;
84    }
85}