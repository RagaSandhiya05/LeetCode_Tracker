// Last updated: 7/9/2026, 9:58:16 AM
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        while(head != null) {
            arr.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = arr.size() - 1;
        while(left < right) {
            if(!arr.get(left).equals(arr.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
            