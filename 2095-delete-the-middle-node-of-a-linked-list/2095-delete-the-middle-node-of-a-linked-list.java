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
        
        ListNode trav = head;
        int count = 0;
        while(trav != null) {
            count++;
            trav = trav.next;
        }
        
        if(count == 0 || count == 1) return null;
        
        int i = 0;
        int j = count/2;
        trav = head;
        while(i < j - 1) {
            trav = trav.next;
            i++;
        }
        
        trav.next = trav.next.next;
        
        return head;
        
    }
}