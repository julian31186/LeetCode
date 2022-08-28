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
    public ListNode rotateRight(ListNode head, int k) {
        int count = 0;
        if(head == null) return null;
        ListNode tail = head;
        
        while(tail.next != null) {
            count++;
            tail = tail.next;
        }
        count++;
        int rotatePoint = count - k % count;
       
        tail.next = head;
        tail = head;
        while(rotatePoint-- > 1) {
            tail = tail.next;
        }
        
        head = tail.next;
        tail.next = null;
       
        
        
        
        return head;
         
    }
}