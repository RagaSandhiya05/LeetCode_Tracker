// Last updated: 7/9/2026, 9:53:30 AM
// Find the Highest Altitude
class Solution {
    public int largestAltitude(int[] gain) {
        int MaxHeight = 0;
        int CurrentHeight = 0;
        for(int g : gain) {
            CurrentHeight = CurrentHeight + g;
            MaxHeight = Math.max(MaxHeight , CurrentHeight);
        }
        return MaxHeight;
    }
}