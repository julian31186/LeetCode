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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode trav = dummy;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
           
            int val = val1 + val2 + carry;
            carry = val / 10;
            val = val % 10;
            
            trav.next = new ListNode(val);
            
             
            
            if(l1 != null)l1 =  l1.next;
            if(l2 != null)l2 =  l2.next;
            trav = trav.next;
        }
        if(carry > 0) {
            ListNode newNode = new ListNode(carry);
            trav.next = newNode;
            trav = trav.next;
        }
        
        return dummy.next;
    }
}