/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head ==null||head.next ==null) 
            return head;
        ListNode f = new ListNode(0);
        ListNode s = new ListNode(0);
        f.next = head;
        head = f;
        
        while(f.next!=null&&f.next.next!=null){
            s = f.next.next;
            f.next.next = s.next;
            s.next = f.next;
            f.next = s;
            f = s.next;
        }
        return head.next;
        
    }
}

