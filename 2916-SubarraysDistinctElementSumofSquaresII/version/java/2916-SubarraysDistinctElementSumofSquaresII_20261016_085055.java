// Last updated: 10/16/2026, 8:50:55 AM
1// Subarrays Distinct Element Sum of Squares II
2class Solution {
3    public int sumCounts(int[] nums) {
4        final long MOD = 1_000_000_007L;
5        int n = nums.length;  
6        int[] last = new int[100001];
7        int[] bitCnt = new int[n + 1];
8        long[] bitSum = new long[n + 1]; 
9        long ans = 0;
10        long curSq = 0;
11        long curSum = 0;
12        long c1 = 0;    
13        for (int j = 1; j <= n; ++j) {
14            int x = nums[j - 1];
15            int p = last[x];
16            last[x] = j; 
17            if (p == 0) {
18                curSq = (curSq + 2 * curSum + j) % MOD;
19                curSum += j;
20                c1++;
21            } else {
22                long cnt = 0, sumM = 0;
23                for (int idx = p - 1; idx > 0; idx -= idx & -idx) {
24                    cnt += bitCnt[idx];
25                    sumM += bitSum[idx];
26                }
27                long prefixD = p * c1 - (long) p * (p - 1) / 2 + p * cnt - sumM;
28                long subSum = curSum - prefixD;
29                int len = j - p;
30                curSq = (curSq + 2 * subSum + len) % MOD;
31                curSum += len;
32                for (int idx = p; idx <= n; idx += idx & -idx) {
33                    bitCnt[idx] += 1;
34                    bitSum[idx] += p;
35                }
36            }
37            ans = (ans + curSq) % MOD;
38        }
39        return (int) ans;
40    }
41}