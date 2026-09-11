// Last updated: 9/11/2026, 8:58:47 AM
1// Unique 3-Digit Even Numbers
2class Solution {
3    public int totalNumbers(int[] digits) {
4        int freq[] = new int[10];
5        for(int d : digits)
6        freq[d]++;
7        int count = 0;
8        for(int h = 1 ; h <= 9 ; h++) {
9            if(freq[h] == 0)
10            continue;
11            freq[h]--;
12            for(int t = 0 ; t <= 9 ; t++) {
13                if(freq[t] == 0)
14                continue;
15                freq[t]--;
16                for(int u = 0 ; u <= 8 ; u = u + 2) {
17                if(freq[u] > 0)
18                count++;
19            }
20            freq[t]++;
21        }
22        freq[h]++;
23    }
24    return count;
25    }
26}
27