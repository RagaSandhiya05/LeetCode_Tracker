// Last updated: 7/11/2026, 9:15:25 AM
1// Count the Number of Complete Components
2class Solution {
3        private Map<Integer , List<Integer>> graph = new HashMap<>();
4        public int countCompleteComponents(int n, int[][] edges) {
5            for(int edge[] : edges) {
6                graph.computeIfAbsent(edge[0] , k -> new ArrayList<>()).add(edge[1]);
7                graph.computeIfAbsent(edge[1] , k -> new ArrayList<>()).add(edge[0]);
8            }
9            Set<Integer> visited = new HashSet<>();
10            int count = 0;
11            for(int i = 0 ; i < n ; i++) {
12                if(!visited.contains(i)) {
13                    Set<Integer> component = new HashSet<>();
14                    dfs(i , component , visited);
15                    if(isCompleteComponent(component))
16                    count++;
17                }
18            }
19            return count;
20        }
21        private void dfs(int node , Set<Integer> component , Set<Integer> visited) {
22            component.add(node);
23            visited.add(node);
24            for(int neighbor : graph.getOrDefault(node , new ArrayList<>())) {
25                if(!visited.contains(neighbor)) {
26                    dfs(neighbor , component , visited);
27                }
28            }
29        }
30        private boolean isCompleteComponent(Set<Integer> component) {
31            for(int node : component) {
32                if(graph.getOrDefault(node , new ArrayList<>()).size() != component.size() - 1) {
33                    return false;
34                }
35            }
36            return true;
37        }
38}