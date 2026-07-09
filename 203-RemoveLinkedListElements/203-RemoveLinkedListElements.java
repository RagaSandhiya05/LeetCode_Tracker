// Last updated: 7/9/2026, 9:58:37 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = new ListNode();
        ListNode output = current;
        while(head != null) {
            if(val != head.val) {
                current.next = new ListNode(head.val);
                current = current.next;
            }
            head = head.next;
        }
        return output.next;
    }
}
          