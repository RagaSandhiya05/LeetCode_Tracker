// Last updated: 7/9/2026, 9:56:59 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int k = 0;
        while(i < g.length && k < s.length){
            if(g[i] <= s[k]){
                i++;
            }
            k++;
        }
        return i;
    }
}
           