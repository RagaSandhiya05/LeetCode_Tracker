// Last updated: 9/23/2026, 8:09:17 PM
1// Minimum Operations to Reduce X to Zero
2class Solution {
3    public int minOperations(int[] A, int x) {
4        int k = -x, n = A.length;
5        for (int a : A) k += a;
6        if (k < 0) return -1;
7        if (k == 0) return n;
8
9        int best = -1, i = 0, s = 0;
10        for (int j = 0; j < n; j++) {
11            s += A[j];
12            while (s > k)
13                s -= A[i++];
14
15            if (s == k)
16                best = Math.max(best, j - i + 1);
17        }
18
19        return best < 0 ? -1 : n - best;
20    }
21}