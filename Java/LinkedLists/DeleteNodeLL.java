/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 
 Deleted a node in the linked list
 No access to head, but direct access to node to be deleted
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode cur = node;
        ListNode previous = null;
        while(cur.next != null) {
            cur.val = cur.next.val;
            previous = cur;
            cur = cur.next;
        }
        previous.next = null;
    }
}
