// Last updated: 10/14/2026, 8:47:29 AM
1// Maximize Sum of Squares of Digits
2class Solution {
3    public String maxSumOfSquares(int num, int sum) {
4        if(num * 9 < sum) {
5            return "";
6        }
7        int N = sum / 9;
8        sum = sum % 9;
9        StringBuilder sb = new StringBuilder("9".repeat(N));
10        if(sum > 0) {
11            sb.append(sum);
12        }
13        sb.append("0".repeat(num - sb.length()));
14        return sb.toString();
15    }
16}
17
18
19      