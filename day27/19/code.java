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
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int remo=length-n+1;
        temp=head;
        if (remo == 1) {
    return head.next;
}
    
        for(int i=1;i<remo-1;i++)temp=temp.next;
        temp.next=temp.next.next;
        return head;
        
    }
}