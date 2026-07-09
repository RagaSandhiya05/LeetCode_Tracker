// Last updated: 7/9/2026, 9:58:27 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for(int num : nums){
            if(!numSet.add(num))
            return true;
        }
        return false;
    }
}
        