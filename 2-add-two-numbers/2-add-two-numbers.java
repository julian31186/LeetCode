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
        ListNode current = dummy;
        int sum = 0;
        int v1 = 0;
        int v2 = 0;
        int carry = 0;
        int lastDigit = 0;
        
        while(l1 != null || l2 != null) {
            v1 = (l1 != null) ? l1.val : 0;
            v2 = (l2 != null) ? l2.val : 0;
            
            sum = v1 + v2 + carry;
            carry = sum / 10;
            lastDigit = sum % 10;
            
            ListNode node = new ListNode(lastDigit);
            current.next = node;
            
            current = current.next;
            if(l1 != null)l1 = l1.next;
            if(l2 != null)l2 = l2.next;
            
        }
        
        if(carry > 0) {
            ListNode extra = new ListNode(carry);
            current.next = extra;
            current = current.next;
        }
        
        
        return dummy.next;
    }
}