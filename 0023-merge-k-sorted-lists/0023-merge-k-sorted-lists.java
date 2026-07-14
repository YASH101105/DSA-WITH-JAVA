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
    public ListNode mergeKLists(ListNode[] lists) {
         if (lists == null || lists.length == 0) {
        return null;
    }

    return sort(lists, 0, lists.length - 1);
    }
    private ListNode sort(ListNode[] lists, int left, int right){
        if(left==right){
            return lists[left];
        }
        if(left>right){
            return null;
        }
        // finding the mid of the array not the linked List so Don't use the getMid class
        int mid = left+(right-left)/2;
        ListNode leftList = sort(lists, left, mid);
ListNode rightList = sort(lists, mid + 1, right);
       return merge(leftList, rightList);
    }
    private ListNode merge(ListNode leftList , ListNode rightList){
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        while(leftList!=null && rightList!=null){
            if(leftList.val<rightList.val){
                temp.next = leftList;
                leftList = leftList.next;
            }
             else{
                temp.next = rightList;
                rightList = rightList.next;
            }
            temp = temp.next;
        }
        temp.next = (leftList!=null)?leftList:rightList;
        return dummy.next;
    }
}