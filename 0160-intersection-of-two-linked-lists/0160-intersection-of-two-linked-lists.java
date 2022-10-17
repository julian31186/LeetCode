/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode travA = headA;
        ListNode travB = headB;
        
        int countA = 0;
        int countB = 0;
        
        while(travA != null) {
            countA++;
            travA = travA.next;
        }
        
        while(travB != null) {
            countB++;
            travB = travB.next;
        }
        
        travA = headA;
        travB = headB;
        

        if(countA < countB) {
            int i = countB - countA;
            while(i > 0) {
                travB = travB.next;
                i--;
            }
                       
        }
        
        if(countB < countA) {
            int i = countA - countB;
            while(i > 0) {
              travA = travA.next;
              i--;
            } 
        }
        
        while(travA != null) {
            if(travA == travB) {
               return travA; 
            } 
            
            travA = travA.next;
            travB = travB.next;
        }
        
        
        return null;
    }
}