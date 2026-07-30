// Last updated: 7/30/2026, 8:54:41 AM
1// Minimum Number of Pushes to Type Word I
2class Solution {
3    public int minimumPushes(String word) {
4        int pushes = 0;
5        for(int i = 0 ; i < word.length() ; i++) {
6            pushes = pushes + (i / 8) + 1;
7        }
8        return pushes;
9    }
10}
11       