// Last updated: 10/18/2026, 11:04:25 PM
1// Number of Ways to Reorder Array to Get Same BST
2class Solution {
3    private static final long MOD = 1000000007L;
4    private long[][] comb;
5    private long count(List<Integer> arr) {
6        int n = arr.size();
7        if (n <= 2) {
8            return 1;
9        }
10        int root = arr.get(0);
11        List<Integer> left = new ArrayList<>();
12        List<Integer> right = new ArrayList<>();
13        for (int x : arr) {
14            if (x < root) {
15                left.add(x);
16            } else if (x > root) {
17                right.add(x);
18            }
19        }
20        int L = left.size();
21        int R = right.size();
22        long ways = comb[L + R][L];
23        return ways * count(left) % MOD * count(right) % MOD;
24    }
25    public int numOfWays(int[] nums) {
26        int n = nums.length;
27        comb = new long[n + 1][n + 1];
28        for (int i = 0; i <= n; i++) {
29            comb[i][0] = comb[i][i] = 1;
30            for (int j = 1; j < i; j++) {
31                comb[i][j] =
32                    (comb[i - 1][j - 1] + comb[i - 1][j]) % MOD;
33            }
34        }
35        List<Integer> arr = new ArrayList<>();
36        for (int x : nums) {
37            arr.add(x);
38        }
39        return (int)((count(arr) - 1 + MOD) % MOD);
40    }
41}