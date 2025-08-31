class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode dummy=head;
        int count=0;
        while(dummy!=null){
            count++;
            dummy=dummy.next;
        }
        int mid=(count/2);
        dummy=head;
        for (int i = 0; i < mid; i++) {
            dummy = dummy.next;
        }       
        return dummy;
    }
}