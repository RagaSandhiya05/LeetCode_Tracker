// Last updated: 10/1/2026, 8:58:45 AM
1// Maximum Nesting Depth of Two Valid Parentheses Strings
2class Solution {
3    public int[] maxDepthAfterSplit(String seq) {
4        int N = seq.length();
5        int ans[] = new int[N];
6        int depth = 0;
7        for(int i = 0 ; i < N ; i++) {
8            if(seq.charAt(i) == '(') {
9                depth++;
10                ans[i] = depth % 2;
11            }
12            else {
13                ans[i] = depth % 2;
14                depth--;
15            }
16        }
17        return ans;
18    }
19}
20           