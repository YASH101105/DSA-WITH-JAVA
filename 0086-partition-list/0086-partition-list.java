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
    public ListNode partition(ListNode head, int x) {
        ListNode dummybefore = new ListNode();
        ListNode dummyafter = new ListNode();
        ListNode before = dummybefore;
        ListNode after = dummyafter;
        while(head!=null){
        if(head.val<x){
            before.next = head;
            before = before.next;
        }
        else{
            after.next = head;
            after = after.next;
        }
        head = head.next;
        }
        before.next = dummyafter.next;
        after.next = null;
        return dummybefore.next;
    }
}