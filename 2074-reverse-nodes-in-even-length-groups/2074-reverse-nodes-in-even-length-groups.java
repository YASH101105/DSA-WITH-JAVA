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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        ListNode present = head;
        int grpsize=1;
       while(present!=null){
        //here we are counting the nodes in each grps
        int count= 0;
        ListNode temp =present;
        while(temp!=null && count<grpsize){
            temp = temp.next;
            count++;
        }
        if(count%2==0){
            ListNode start = present;
            ListNode prevNode = temp;
              for (int i = 0; i < count; i++) {
                    ListNode next = present.next;
                    present.next = prevNode;
                    prevNode = present;
                    present = next;
            }
            prev.next = prevNode;
                prev = start;
        }
        else{
            for(int i = 0;i<count;i++){
                prev = present;
                present = present.next;
            }
        }
       
       grpsize++;
       }
       return dummy.next;
    }
}