/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 Convert the binary representation of a Linked List into an integer
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        while(head != null) {
            ans *= 2;
            ans += head.val;
            head = head.next;
        }   
        return ans;
    }
}