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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<ListNode> list = new ArrayList<>();
        Collections.addAll(list,lists);
        ListNode head = new ListNode();
        while(list.remove(null)) {}
        ListNode temp = head;
        
        //if(list.isEmpty()) return null;
               
        
        while(!list.isEmpty()) {
            int min = Integer.MAX_VALUE;
            ListNode minNode = new ListNode();
            for(ListNode trav : list) {         
                if(trav.val < min) {
                    minNode = trav;
                    min = trav.val;
                }
               
            }
            
            if(minNode.next == null) {
                list.remove(minNode);
            } else {
                list.set(list.indexOf(minNode) , minNode.next);
            }
            temp.val = min;
            if(!list.isEmpty()) temp.next = new ListNode();
            temp = temp.next;  
        }
        
        if(temp == head) return null;
        
        
        return head;
    }
}