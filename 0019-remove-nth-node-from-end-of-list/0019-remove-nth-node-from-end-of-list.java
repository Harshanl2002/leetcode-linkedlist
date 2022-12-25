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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null)
        {
            return null;
        }
        ListNode curr=head;
        int l=0;
        while(curr!=null)
        {
            curr=curr.next;
            l++;
        }
        if(l==n)
        {
            return head.next;
        }
        curr=head;
        
        for(int i=0;i<l-n-1;i++)
        {
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}