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
    public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		// finding the middle node
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode second = reverse(slow);
		ListNode first = head;
		while(second!=null){
		if (first.val != second.val) {
			return false;
		}
		 second = second.next;
		    first = first.next;}
		return true;
	}
	public ListNode reverse(ListNode head) {
		ListNode prev = null;
		ListNode present = head;
		while (present != null) {
			ListNode next = present.next;
			next = present.next;
			present.next = prev;
			prev = present;
			present = next;
			if (next != null) {
				next = next.next;
			}
		}
		return prev;
	}
}