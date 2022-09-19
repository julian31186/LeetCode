/**
 * // This is the ImmutableListNode's API interface.
 * // You should not implement it, or speculate about its implementation.
 * interface ImmutableListNode {
 *     public void printValue(); // print the value of this node.
 *     public ImmutableListNode getNext(); // return the next node.
 * };
 */

class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) {
      
        Stack<ImmutableListNode> stack = new Stack<>();
        stack.push(head);
        
        while(head.getNext() != null) {
            stack.push(head.getNext());
            head = head.getNext();
        }
        while(!stack.isEmpty()) stack.pop().printValue();
        
    }
}