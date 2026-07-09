// Last updated: 7/9/2026, 9:51:56 AM
// Destroying Asteroids
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long curMass = mass;
        for(int val : asteroids) {
            if(val > curMass)
            return false;
            curMass = curMass + val;
        }
        return true;
    }
}
       