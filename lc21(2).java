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
        ListNode head = new ListNode(0);
        ListNode cN = head;
        while(true){
            if(l1==null&&l2==null) break;
            else if(l2!=null&&(l1==null||l1.val>l2.val)){
                cN.next = l2;
                l2 = l2.next;
            }
            else{
                cN.next=l1;
                l1=l1.next;
            }
            cN = cN.next;
        }
        
        return head.next;
        
    }
}