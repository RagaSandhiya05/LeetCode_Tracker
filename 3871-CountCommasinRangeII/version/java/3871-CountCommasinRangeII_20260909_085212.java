// Last updated: 9/9/2026, 8:52:12 AM
1// Count Commas in Rnage II
2class Solution {
3    public long countCommas(long n) {
4        long start = 1000;
5        long commas = 1;
6        long answer = 0;
7        while(start <= n) {
8            long end = (start > n / 1000) ? n : start * 1000 - 1;
9            long count = end - start + 1;
10            answer = answer + count * commas;
11            start = start * 1000;
12            ++commas;
13        }
14        return answer;
15    }
16}