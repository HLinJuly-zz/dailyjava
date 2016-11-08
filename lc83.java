/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null) return head;
        
        ListNode temp = head;
        ListNode tempnext = head.next;
        while(tempnext!=null){
            if(temp.val==tempnext.val){
                temp.next = tempnext.next;
                tempnext = tempnext.next;
            }
            else{
                temp = temp.next;
            }
            
            
        }
        
        
        return head;
    }
}