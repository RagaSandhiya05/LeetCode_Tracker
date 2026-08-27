// Last updated: 8/27/2026, 10:01:22 AM
1// Lexicographically Smallest Permutation Greater Than Target
2class Solution {
3    public String lexGreaterPermutation(String s, String target) {
4        int n = s.length();
5        int cnt[] = new int[26];
6        for(char c : s.toCharArray()) {
7            cnt[c - 'a']++;
8        }
9        for(int i = n - 1 ; i >= 0 ; i--) {
10            int remain[] = cnt.clone();
11            boolean possible = true;
12            for(int j = 0 ; j < i ; j++) {
13                int x = target.charAt(j) - 'a';
14                if(remain[x] == 0) {
15                    possible = false;
16                    break;
17                }
18                remain[x]--;
19            }
20            if(!possible)
21            continue;
22            int targetChar = target.charAt(i) - 'a';
23            for(int c = targetChar + 1 ; c < 26 ; c++) {
24                if(remain[c] == 0)
25                continue;
26                StringBuilder ans = new StringBuilder(target.substring(0 , i));
27                ans.append((char) ('a' + c));
28                remain[c]--;
29                for(int x = 0 ; x < 26 ; x++) {
30                    for(int t = 0 ; t < remain[x] ; t++) {
31                        ans.append((char)('a' + x));
32                    }
33                }
34                return ans.toString();
35            }
36        }
37        return "";
38    }
39}
40                   