/*

*/
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
        ListNode temp = head;
        int num = 0;
        
        //Find the size of the list
        while(temp != null) {
            temp = temp.next;
            num++;
        }
        
        //i to keep tack of whether we reach the node we need to remove
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        //Use pre to store the previous node
        //Use cur to store the current node we want to delete
        ListNode pre = dummy, cur = head;
        int i = 0;
        while(i <= num - n -1) {
            pre = cur;
            cur = cur.next;
            i++;
        }
        pre.next = cur.next;
        return dummy.next;
    }
}
