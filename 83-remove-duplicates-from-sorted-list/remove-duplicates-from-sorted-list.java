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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        ListNode dummy=head;
        while(curr!=null && curr.next!=null){
            if(curr.val!=curr.next.val){
                curr=curr.next;
                continue;
            }
            curr.next=curr.next.next;
            
        }
        return dummy;
    }
}