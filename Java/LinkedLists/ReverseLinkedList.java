/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 Reversing a Linked List
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode node = head;
        while(head.next != null) {
            ListNode temp = head.next;
            head.next = temp.next;
            temp.next = node;
            node = temp;
        }
        head = node;
        
        return head;
    }
}
