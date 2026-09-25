// Last updated: 9/25/2026, 10:22:55 AM
1// Brace Expansion II
2class Solution {
3    public List<String> braceExpansionII(String expression) {
4        return dfs(expression, 0, expression.length() - 1);
5    }
6    private List<String> dfs(final String expression, int s, int e) {
7        TreeSet<String> ans = new TreeSet<>();
8        List<List<String>> groups = new ArrayList<>();
9        groups.add(new ArrayList<>());
10        int layer = 0;
11        int left = 0;
12        for (int i = s; i <= e; ++i)
13            if (expression.charAt(i) == '{' && ++layer == 1)
14                left = i + 1;
15            else if (expression.charAt(i) == '}' && --layer == 0)
16                merge(groups, dfs(expression, left, i - 1));
17            else if (expression.charAt(i) == ',' && layer == 0)
18                groups.add(new ArrayList<>());
19            else if (layer == 0)
20                merge(groups, new ArrayList<>(List.of(String.valueOf(expression.charAt(i)))));
21        for (final List<String> group : groups)
22            for (final String word : group)
23                ans.add(word);
24        return new ArrayList<>(ans);
25    }
26    void merge(List<List<String>> groups, List<String> group) {
27        if (groups.get(groups.size() - 1).isEmpty()) {
28            groups.set(groups.size() - 1, group);
29            return;
30        }
31        List<String> mergedGroup = new ArrayList<>();
32        for (final String word1 : groups.get(groups.size() - 1))
33            for (final String word2 : group)
34                mergedGroup.add(word1 + word2);
35        groups.set(groups.size() - 1, mergedGroup);
36    }
37}