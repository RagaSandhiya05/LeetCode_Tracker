// Last updated: 7/9/2026, 9:57:04 AM
//Find All Numbers Disappeared in an Array
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int val : nums) {
            set.add(val);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i <= nums.length ; i++) {
            if(!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}

       