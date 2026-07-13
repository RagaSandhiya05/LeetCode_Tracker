// Last updated: 7/13/2026, 9:36:30 AM
1// Sequential Digits
2class Solution {
3    public List<Integer> sequentialDigits(int low, int high) {
4        List<Integer> ans = new ArrayList<>();
5        String s = "123456789";
6        String l = String.valueOf(low);
7        String h = String.valueOf(high);
8        for(int len = l.length() ; len <= h.length() ; len++) {
9            for(int start = 0 ; start <= 9 - len ; start++) {
10                int num = Integer.parseInt(s.substring(start , start + len));
11                if(num >= low && num <= high) {
12                    ans.add(num);
13                }
14            }
15        }
16        return ans;
17    }
18}