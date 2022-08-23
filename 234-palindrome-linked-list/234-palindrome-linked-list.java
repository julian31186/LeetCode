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
    public boolean isPalindrome(ListNode head) {
        ListNode trav = head;
        StringBuilder ans = new StringBuilder("");
        while(trav != null) {
            ans.append(trav.val);
            trav = trav.next;
        }
        
        return isPalindrome(ans.toString());
    }
    
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
     
        }
        return true;
    }
    
}