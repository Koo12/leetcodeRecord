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
        if(head.next==null){
            return null;
        }
        ListNode left,right;
        ListNode root = new ListNode();
        root.next = head;
        right = root;
        int count=1;
        while(count<=n){
            right=right.next;
            count++;
        }
        left = root;
        while(right.next!=null){
            right=right.next;
            left=left.next;
        }
        if(left.next.next!=null){
            left.next=left.next.next;
        }else{
            left.next=null;
        }
        return root.next;
    }
}