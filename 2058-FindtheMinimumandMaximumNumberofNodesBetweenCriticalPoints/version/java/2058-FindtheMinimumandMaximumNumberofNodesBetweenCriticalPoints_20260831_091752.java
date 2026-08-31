// Last updated: 8/31/2026, 9:17:52 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11
12// Find the Minimum and Maximum Number of Nodes Between Critical Points
13class Solution {
14    public int[] nodesBetweenCriticalPoints(ListNode head) {
15        ListNode prev = head;
16        ListNode curr = head.next;
17        int index = 1;
18        int FirstCritical = -1;
19        int LastCritical = -1;
20        int MinDist = Integer.MAX_VALUE;
21        while(curr.next != null) {
22            ListNode next = curr.next;
23            boolean isMax = curr.val > prev.val && curr.val > next.val;
24            boolean isMin = curr.val < prev.val && curr.val < next.val;
25            if(isMax || isMin) {
26                if(LastCritical == -1) {
27                    FirstCritical = index;
28                }
29                else {
30                    MinDist = Math.min(MinDist, index - LastCritical);
31                }
32                LastCritical = index;
33            }
34            prev = curr;
35            curr = next;
36            index++;
37        }
38        if(FirstCritical == -1 || FirstCritical == LastCritical) {
39            return new int[]{-1, -1};
40        }
41        int MaxDist = LastCritical - FirstCritical;
42        return new int[]{MinDist, MaxDist};
43    }
44}
45