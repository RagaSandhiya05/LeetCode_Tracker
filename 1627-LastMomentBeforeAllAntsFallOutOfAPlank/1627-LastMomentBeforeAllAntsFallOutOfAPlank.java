// Last updated: 7/9/2026, 9:54:07 AM
// Last Moment Before All Ants Fall Out of a Plank
class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int LastFallTime = 0;
        for(int LeftPosition : left) {
            LastFallTime = Math.max(LastFallTime , LeftPosition);
        }
        for(int RightPosition : right) {
            LastFallTime = Math.max(LastFallTime , n - RightPosition);
        }
        return LastFallTime;
    }
}