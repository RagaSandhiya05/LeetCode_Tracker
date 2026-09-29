// Last updated: 9/29/2026, 9:03:52 AM
1// Check if There Is a Valid Parentheses String Path
2class Solution {
3    private boolean[][][] visited;
4    public boolean hasValidPath(char[][] grid) {
5        int m = grid.length, n = grid[0].length;
6        if ((m + n - 1) % 2 != 0 ||
7            grid[0][0] == ')' ||
8            grid[m - 1][n - 1] == '(') {
9            return false;
10        }
11        int maxBal = (m + n) / 2;
12        visited = new boolean[m][n][maxBal + 1];
13        return dfs(grid, 0, 0, 0, m, n, maxBal);
14    }
15    private boolean dfs(char[][] grid, int r, int c,
16                        int bal, int m, int n, int maxBal) {
17        bal += (grid[r][c] == '(' ? 1 : -1);
18        if (bal < 0 || bal > maxBal) {
19            return false;
20        }
21        if (r == m - 1 && c == n - 1) {
22            return bal == 0;
23        }
24        if (visited[r][c][bal]) {
25            return false;
26        }
27        visited[r][c][bal] = true;
28        if (r + 1 < m &&
29            dfs(grid, r + 1, c, bal, m, n, maxBal)) {
30            return true;
31        }
32        if (c + 1 < n &&
33            dfs(grid, r, c + 1, bal, m, n, maxBal)) {
34            return true;
35        }
36        return false;
37    }
38}