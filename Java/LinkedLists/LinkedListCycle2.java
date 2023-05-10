/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<ListNode>();
        ListNode node = head;

        while(node != null) {               // Iterate through the linked list
            if (visited.contains(node))     // Return node if it is revisited
                return node;
            visited.add(node);
            node = node.next;               // Set the next node
        }

        return null; // Base Case
    }
}
