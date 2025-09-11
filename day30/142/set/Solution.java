/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode>vis=new HashSet<>();
        ListNode dummy=head;
        while(dummy!=null){
            if(vis.contains(dummy))return dummy;
            vis.add(dummy);
            dummy=dummy.next;
        }
        
        return null;
    }
}