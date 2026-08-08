// Last updated: 8/8/2026, 2:48:59 PM
1// Find the Lexicographically Smallest Valid Sequence
2class Solution {
3    public int[] validSequence(String word1, String word2) {
4        char[] s = word1.toCharArray();
5        char[] t = word2.toCharArray();
6        int n = s.length;
7        int m = t.length;
8        int[] suffix = new int[n + 1];
9        int j = m - 1;
10        int matched = 0;
11        for (int i = n - 1; i >= 0; i--) {
12            if (j >= 0 && s[i] == t[j]) {
13                matched++;
14                j--;
15            }
16            suffix[i] = matched;
17        }
18        int[] ans = new int[m];
19        int i = 0;
20        j = 0;
21        while (i < n && j < m) {
22            if (s[i] == t[j]) {
23                ans[j] = i;
24                j++;
25            } else {
26                if (suffix[i + 1] >= m - j - 1) {
27                    ans[j] = i;
28                    j++;
29                    i++;
30                    break;
31                }
32            }
33            i++;
34        }
35        if (j < m && i == n)
36            return new int[0];
37        while (i < n && j < m) {
38            if (s[i] == t[j]) {
39                ans[j] = i;
40                j++;
41            }
42            i++;
43        }
44        if (j != m)
45            return new int[0];
46        return ans;
47    }
48}