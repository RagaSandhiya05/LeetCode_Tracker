// Last updated: 10/8/2026, 10:16:58 PM
1// Remove Invalid Parentheses
2class Solution {
3    public List<String> removeInvalidParentheses(String s) {
4        List<String> res = new ArrayList<>();
5        fwd(s, res, 0, 0);
6        return res;
7    }
8    private void fwd(String s, List<String> res, int li, int lj) {
9        int bal = 0;
10        for (int i = li; i < s.length(); i++) {
11            if (s.charAt(i) == '(') bal++;
12            if (s.charAt(i) == ')') bal--;
13            if (bal >= 0) continue;
14            for (int j = lj; j <= i; j++)
15                if (s.charAt(j) == ')' && (j == lj || s.charAt(j - 1) != ')'))
16                    fwd(s.substring(0, j) + s.substring(j + 1), res, i, j);
17            return;
18        }
19        bwd(s, res, s.length() - 1, s.length() - 1);
20    }
21    private void bwd(String s, List<String> res, int ri, int rj) {
22        int bal = 0;
23        for (int i = ri; i >= 0; i--) {
24            if (s.charAt(i) == ')') bal++;
25            if (s.charAt(i) == '(') bal--;
26            if (bal >= 0) continue;
27            for (int j = rj; j >= i; j--)
28                if (s.charAt(j) == '(' && (j == rj || s.charAt(j + 1) != '('))
29                    bwd(s.substring(0, j) + s.substring(j + 1), res, i - 1, j - 1);
30            return;
31        }
32        res.add(s);
33    }
34}