// Last updated: 7/29/2026, 5:32:21 PM
1// Smallest Palindromic Rearrangement II
2class Solution {
3    public String smallestPalindrome(String s, int k) {
4        int[] freq = new int[26];
5        int n = s.length();
6        int cnt = 0;
7        long totalWays = 1L;
8        for (int i = 0; i < n / 2; i++)
9            freq[s.charAt(i) - 'a']++;
10        StringBuilder sb = new StringBuilder();
11        outer:
12        for (int i = 25; i >= 0; i--) {
13            if (freq[i] == 0)
14                continue;
15            int j = 1;
16            while (j <= freq[i]) {
17                cnt++;
18                totalWays = (totalWays * cnt) / j;
19                if (totalWays > k) {
20                    for (int l = 0; l < i; l++) {
21                        while (freq[l] > 0) {
22                            sb.append((char) ('a' + l));
23                            freq[l]--;
24                        }
25                    }
26                    while (freq[i] > j) {
27                        sb.append((char) ('a' + i));
28                        freq[i]--;
29                    }
30                    break outer;
31                }
32                j++;
33            }
34        }
35        if (k > totalWays)
36            return "";
37        for (int i = 0; i < cnt; i++) {
38            for (char ch = 'a'; ch <= 'z'; ch++) {
39                int j = ch - 'a';
40                if (freq[j] == 0)
41                    continue;
42                if (k <= (totalWays * freq[j]) / (cnt - i)) {
43                    totalWays = (totalWays * freq[j]) / (cnt - i);
44                    freq[j]--;
45                    sb.append(ch);
46                    break;
47                } else {
48                    k -= (int) ((totalWays * freq[j]) / (cnt - i));
49                }
50            }
51        }
52        if (n % 2 == 1)
53            sb.append(s.charAt(n / 2));
54        for (int i = n / 2 - 1; i >= 0; i--)
55            sb.append(sb.charAt(i));
56        return sb.toString();
57    }
58}