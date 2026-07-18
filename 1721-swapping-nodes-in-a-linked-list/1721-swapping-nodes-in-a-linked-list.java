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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy.next;
        ListNode startK = getStart(head , k);
        ListNode EndK = getEnd(head, k);
       int temp = startK.val;
startK.val = EndK.val;
EndK.val = temp;

return head;
    }
    private ListNode getEnd(ListNode head, int k) {
    int length = 0;
    ListNode temp = head;

    while (temp != null) {
        length++;
        temp = temp.next;
    }

    if (k > length) return null;

    temp = head;

    for (int i = 0; i < length - k; i++) {
        temp = temp.next;
    }

    return temp;
}

   private ListNode getStart(ListNode head, int k) {
    ListNode temp = head;

    for (int i = 1; i < k && temp != null; i++) {
        temp = temp.next;
    }

    return temp;
}
}