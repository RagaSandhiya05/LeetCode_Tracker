// Last updated: 7/9/2026, 10:00:16 AM
    class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next == null) return head;
        if(left == right) return head;

        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        int i = 1;
        while(i < left){
            prev = curr;
            curr = curr.next;
            i++;
        }
        next = curr.next;

        ListNode curr1 = head;
        ListNode prev1 = null;
        ListNode next1;
        int j=1;
        while(j < right){
            prev1 = curr1;
            curr1 = curr1.next;
            j++;
        }
        next1 = curr1.next;

        ListNode temp = next;
        ListNode temp_prev = curr; 
        ListNode temp_next;
        int l = left + 1;
        while(l < right){
            temp_next = temp.next;
            temp.next = temp_prev;
            temp_prev = temp;
            temp = temp_next;
            l++;
        }
        if(prev != null){
            prev.next = curr1;
        }
        curr1.next = prev1;

        curr.next = next1;

        if (left == 1){
            head = curr1;
        }
        return head;
    }
}