// Last updated: 8/23/2026, 10:02:00 AM
1// Sum Game
2class Solution {
3    public boolean sumGame(String num) {
4        int n = num.length();
5        int diff = 0;
6        int count = 0;
7        for (int i = 0 ; i < n ; i++) {
8            boolean firstHalf = i < n / 2;
9            if (num.charAt(i) == '?') {
10                count += firstHalf ? 1 : -1;
11            } else {
12                int digit = num.charAt(i) - '0';
13                diff += firstHalf ? digit : -digit;
14            }
15        }
16
17        return 2 * diff != -9 * count;
18    }
19}