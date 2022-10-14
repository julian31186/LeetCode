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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        
        ListNode trav = head;
        int count = 0;
        while(trav != null) {
            count++;
            trav = trav.next;
        }
        System.out.println(1/2);
        
        trav = head;
        for(int i = 0; i < (count/2)- 1; i++) {
            trav = trav.next;
        }
        trav.next = trav.next.next;
        
        
        return head;
    }
}