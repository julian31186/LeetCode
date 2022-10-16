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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode newHead = dummy;
        ListNode trav = head.next;
        int sum = 0;
        
        while(trav != null) {
            if(trav.val == 0) {
                System.out.println(sum);
                ListNode node = new ListNode(sum);
                dummy.next = node;
                dummy = dummy.next;
                sum = 0;
            }
            sum += trav.val;
            trav = trav.next;
        }
        
        
        return newHead.next;
    }
}