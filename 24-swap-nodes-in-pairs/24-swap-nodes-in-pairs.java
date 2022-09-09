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
    public ListNode swapPairs(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode trav = head;
             
        while(trav != null) {
            list.add(trav.val);
            trav = trav.next;
        }
        
        for(int i = 0; i < list.size()-1; i+=2) {
            int temp = list.get(i);
            list.set(i,list.get(i+1));
            list.set(i+1,temp);
        }
        
        
        
        ListNode newHead = new ListNode();
        ListNode ans = newHead;
        for(int i = 0; i < list.size(); i++) {
            ListNode node = new ListNode(list.get(i));
            newHead.next = node;
            newHead = newHead.next;
        }
        
        
        
        return ans.next;
    }
}