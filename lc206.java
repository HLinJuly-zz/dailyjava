/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 //iterative
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
        
        
        
    }
}

//recursive
public class Solution{
    public ListNode reverseList(ListNode head){
        if(head==null||head.next==null){
            return head;
            
        }
        return getRecursive(head, null);
    }
    
    public ListNode getRecursive(ListNode cur, ListNode prev){
        if(cur.next==null){
            cur.next=prev;
            return cur;
            
        }
        ListNode n1=cur.next;
        cur.next = prev;
        return getRecursive(n1, cur);
    }
    
}