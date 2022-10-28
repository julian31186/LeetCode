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
    public int getDecimalValue(ListNode head) {
        String num = "";
        int ans = 0;
        ListNode trav = head;
        
        
        while(trav != null) {
            num += String.valueOf(Integer.valueOf(trav.val));
            trav = trav.next;
        }
        
        int index = 0;
        for(int i = num.length()-1; i >= 0; i--) {
            if(Integer.valueOf(String.valueOf(num.charAt(i))) == 1) {
                ans += (1*Math.pow(2,index));
            }
            index++;
        }
        
        
        return ans;
    }
}