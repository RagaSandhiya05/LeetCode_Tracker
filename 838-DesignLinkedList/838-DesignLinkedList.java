// Last updated: 7/9/2026, 9:55:54 AM
class MyLinkedList {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private ListNode head;
    private ListNode tail;
    private int size;

    public MyLinkedList() {
        head = tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;

        ListNode temp = head;
        while (index > 0) {
            temp = temp.next;
            index--;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        if (size == 0)
            tail = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        if (tail == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size)
            return;
        if (index == 0)
            addAtHead(val);
        else if (index == size)
            addAtTail(val);
        else {
            ListNode temp = head;
            for (int i = 0; i < index - 1; i++) 
                temp = temp.next;

            ListNode newNode = new ListNode(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) 
            return;
        if (index == 0) {
            head = head.next;
            if (--size == 0)
                tail = null;
        } else {
            ListNode temp = head;
            for (int i = 0; i < index - 1; i++) 
                temp = temp.next;

            if (temp.next == tail)
                tail = temp;
            temp.next = temp.next.next;
            size--;
        }
    }
}