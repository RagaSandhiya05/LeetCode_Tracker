// Last updated: 7/9/2026, 9:45:52 AM
// Mirror Distance of an Integer
class Solution {
    private int revnum(int a) {
        if(a / 10 == 0)
        return a;
        String s = new StringBuilder(Integer.toString(a)).reverse().toString();
        return Integer.parseInt(s);
    }
    public int mirrorDistance(int n) {
        return Math.abs(n - revnum(n));
    }
}
    