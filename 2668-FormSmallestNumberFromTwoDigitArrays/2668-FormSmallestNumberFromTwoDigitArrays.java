// Last updated: 7/9/2026, 9:50:55 AM
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        boolean inter = false;
        int min1 = 10;
        int min2 = 10;
        for(int x : nums1) {
            set.add(x);
            min1 = Math.min(min1 , x);
        }
        int min = 10;
        for(int y : nums2) {
            if(set.contains(y)) {
                inter = true;
                min = Math.min(min , y);
            }
            min2 = Math.min(min2 , y);
        }
        if(inter) {
            return min;
        }
        return min1<min2?(min1*10)+min2:(min2*10)+min1;
    }
}
    