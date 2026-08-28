// Last updated: 8/28/2026, 8:45:04 PM
1// Lexicographically Smallest Palindromic Permutation Greater Than Target
2class Solution {
3    public String lexPalindromicPermutation(String s, String target) {
4        int[] freq = new int[26];
5        for (int i = 0; i < s.length(); i++)
6            freq[s.charAt(i) - 'a']++;
7
8        char center = 0;
9        for (int i = 0; i < 26; i++) {
10            if (freq[i] % 2 != 0) {
11                if (center != 0)
12                    return "";
13                center = (char) ('a' + i);
14                freq[i]--;
15            }
16        }
17
18        int sz = s.length();
19        int half = sz / 2;
20        for (int i = 0; i < half; i++)
21            freq[target.charAt(i) - 'a'] -= 2;
22
23        if (check(freq)) {
24            String head = target.substring(0, half);
25            String rev = new StringBuilder(head).reverse().toString();
26            String tail = "";
27            if (center != 0)
28                tail += center;
29            tail += rev;
30            if (tail.compareTo(target.substring(half)) > 0)
31                return head + tail;
32        }
33
34        for (int i = half - 1; i >= 0; i--) {
35            char w = target.charAt(i);
36            freq[w - 'a'] += 2;
37            if (!check(freq))
38                continue;
39
40            for (int j = (w - 'a') + 1; j < 26; j++) {
41                if (freq[j] == 0)
42                    continue;
43                freq[j] -= 2;
44                StringBuilder answer = new StringBuilder(target.substring(0, i + 1));
45                answer.setCharAt(i, (char) ('a' + j));
46
47                for (int k = 0; k < 26; k++) {
48                    int cnt = freq[k] / 2;
49                    for (int m = 0; m < cnt; m++)
50                        answer.append((char) ('a' + k));
51                }
52
53                String part = new StringBuilder(answer).reverse().toString();
54                if (center != 0)
55                    answer.append(center);
56                answer.append(part);
57                return answer.toString();
58            }
59        }
60
61        return "";
62    }
63
64    boolean check(int[] freq) {
65        for (int v : freq)
66            if (v < 0)
67                return false;
68        return true;
69    }
70}