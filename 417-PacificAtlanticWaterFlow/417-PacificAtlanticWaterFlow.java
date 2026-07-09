// Last updated: 7/9/2026, 9:57:17 AM
class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] A) {
        int m = A.length, n = A[0].length;
        boolean[][] pac = new boolean[m][n], atl = new boolean[m][n];
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            dfs(A, pac, i, 0); dfs(A, atl, i, n - 1);
        }
        for (int j = 0; j < n; j++) {
            dfs(A, pac, 0, j); dfs(A, atl, m - 1, j);
        }

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (pac[i][j] && atl[i][j])
                    res.add(List.of(i, j));
        return res;
    }

    void dfs(int[][] A, boolean[][] vis, int i, int j) {
        int m = A.length, n = A[0].length;
        vis[i][j] = true;
        for (int[] d : new int[][]{{1,0},{-1,0},{0,1},{0,-1}}) {
            int x = i + d[0], y = j + d[1];
            if (x >= 0 && x < m && y >= 0 && y < n && !vis[x][y] && A[x][y] >= A[i][j])
                dfs(A, vis, x, y);
        }
    }
}