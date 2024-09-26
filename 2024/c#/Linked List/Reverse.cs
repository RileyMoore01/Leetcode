/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
 
public class Solution {
    public ListNode ReverseList(ListNode head) {
        // edge case
        if (head == null)
            return null;
        
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode current = head;
        
        // push all nodes onto the stack
        while (current != null)
        {
            stack.Push(current);
            current = current.next;
        }
        
        // Pop ndoes from teh stack to create the reversed list
        ListNode newHead = stack.Pop();
        ListNode currentNew = newHead;
        
        while(stack.Count > 0) 
        {
            currentNew.next = stack.Pop();
            currentNew = currentNew.next;
        }
        
         // set the next of the last node to null to terminate the list
         currentNew.next = null;
        
        return newHead;
    }
}
