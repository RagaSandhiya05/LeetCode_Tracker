// Last updated: 8/5/2026, 8:57:30 AM
1// Remove Methods From Project
2class Solution {
3    public void func(int u , List<List<Integer>> adj , boolean visited[]) {
4        visited[u] = true;
5        for(int v : adj.get(u)) {
6            if(visited[v])
7            continue;
8            func(v , adj , visited);
9        }
10    }
11    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
12        List<List<Integer>> adj = new ArrayList<>();
13        for(int i = 0 ; i < n ; i++) {
14            adj.add(new ArrayList<>());
15        }
16        for(int it[] : invocations) {
17            int u = it[0];
18            int v = it[1];
19            adj.get(u).add(v);
20        }
21        boolean visited[] = new boolean[n];
22        func(k , adj , visited);
23        for(int it[] : invocations) {
24            int u = it[0];
25            int v = it[1];
26            if(visited[u])
27            continue;
28            if(visited[v]) {
29                List<Integer> ans = new ArrayList<>();
30                for(int i = 0 ; i < n ; i++) {
31                    ans.add(i);
32                }
33                return ans;
34            }
35        }
36        List<Integer> ans = new ArrayList<>();
37        for(int i = 0 ; i < n ; i++) {
38            if(!visited[i]) {
39                ans.add(i);
40            }
41        }
42        return ans;
43    }
44}
45           