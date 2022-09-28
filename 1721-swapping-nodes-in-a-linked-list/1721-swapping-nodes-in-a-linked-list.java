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
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<ListNode> list = new ArrayList<>();
        
        ListNode trav = head;
        while(trav != null) {
            list.add(trav);
            trav = trav.next;
        }
        
        System.out.println(list.get(k-1).val);
        System.out.println(list.get(list.size()-k).val);
        
        int temp = list.get(k-1).val;
        list.get(k-1).val = list.get(list.size() - k).val;
        list.get(list.size() - k).val = temp;
        
        return head;
        
    }
}