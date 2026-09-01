// Last updated: 9/1/2026, 11:36:41 AM
1// Minimum Moves to Clean the Classroom
2class Solution {
3    public int minMoves(String[] classroom, int energy) {
4        int M = classroom.length;
5        int N = classroom[0].length();
6        int[][] id = new int[M][N];
7        int sr = 0;
8        int sc = 0;
9        int litterCount = 0;
10        for (int i = 0; i < M; i++) {
11            for (int j = 0; j < N; j++) {
12                char ch = classroom[i].charAt(j);
13                if (ch == 'S') {
14                    sr = i;
15                    sc = j;
16                }
17                if (ch == 'L') {
18                    id[i][j] = litterCount++;
19                }
20            }
21        }
22        if (litterCount == 0) {
23            return 0;
24        }
25        int fullMask = (1 << litterCount) - 1;
26        boolean[][][][] visited =
27            new boolean[M][N][energy + 1][1 << litterCount];
28        Queue<int[]> queue = new LinkedList<>();
29        queue.offer(new int[] {
30            sr, sc, energy, fullMask
31        });
32        visited[sr][sc][energy][fullMask] = true;
33        int[] dr = {-1, 1, 0, 0};
34        int[] dc = {0, 0, -1, 1};
35        int moves = 0;
36        while (!queue.isEmpty()) {
37            int size = queue.size();
38            while (size-- > 0) {
39                int[] curr = queue.poll();
40                int R = curr[0];
41                int C = curr[1];
42                int E = curr[2];
43                int mask = curr[3];
44                if (mask == 0) {
45                    return moves;
46                }
47                if (E == 0) {
48                    continue;
49                }
50                for (int d = 0; d < 4; d++) {
51                    int nr = R + dr[d];
52                    int nc = C + dc[d];
53                    if (nr < 0 || nr >= M ||
54                        nc < 0 || nc >= N) {
55                        continue;
56                    }
57                    if (classroom[nr].charAt(nc) == 'X') {
58                        continue;
59                    }
60                    char cell = classroom[nr].charAt(nc);
61                    int newEnergy = E - 1;
62                    if (cell == 'R') {
63                        newEnergy = energy;
64                    }
65                    int newMask = mask;
66                    if (cell == 'L') {
67                        newMask &= ~(1 << id[nr][nc]);
68                    }
69                    if (!visited[nr][nc][newEnergy][newMask]) {
70                        visited[nr][nc][newEnergy][newMask] = true;
71                        queue.offer(new int[] {
72                            nr, nc, newEnergy, newMask
73                        });
74                    }
75                }
76            }
77            moves++;
78        }
79        return -1;
80    }
81}
82
83