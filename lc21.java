/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode fhead = new ListNode(-1);
        ListNode l3 = fhead;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                
                l3.next = l1;
                l3 = l3.next;
                l1 = l1.next;
            }else{
                l3.next = l2;
                l3 = l3.next;
                l2 = l2.next;
                
            }
            
            
        }
        
        if(l1 !=null)
            l3.next = l1;
            
        
        else if(l2 != null)
            l3.next = l2;
            
        return fhead.next;
    }
}