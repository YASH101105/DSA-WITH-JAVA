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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = length(head);
        int get = len-n;
        if(get==0){
            return head.next;
        }

        ListNode present = head;
       for(int i= 1 ; i<get ;i++){
        present = present.next;
       }
            present.next = present.next.next ;
       
             return head;
         }
    public int length(ListNode head){
        int length = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        return length;
    }
}