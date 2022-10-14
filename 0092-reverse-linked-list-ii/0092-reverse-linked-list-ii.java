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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next == null) return head;
        ListNode trav = head;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(trav != null) {
            list.add(trav.val);
            trav = trav.next;
        }

        int i = left - 1;
        int j = right - 1;
        System.out.println(i + " " + j);
        
        while(i <= j) {
            int temp = list.get(i);
            System.out.print("asd;;");
            list.set(i, list.get(j));
            list.set(j, temp);
            
            i++;
            j--;
        }
        
        
        ListNode dummy = new ListNode();
        ListNode newHead = dummy;
        for(int k = 0; k < list.size(); k++) {
            ListNode node = new ListNode(list.get(k));
            dummy.next = node;
            dummy = dummy.next;
        }
        

        return newHead.next;
    }
}