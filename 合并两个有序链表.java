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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode root = new ListNode();
        ListNode p,q,l;
        l=root;
        p=list1;
        q=list2;
        while(p!=null && q!=null){
            if(p.val < q.val){
                l.next=p;
                p=p.next;
            }else{
                l.next=q;
                q=q.next;
            }
            l=l.next;
        }

        if(p==null){
            l.next=q;
        }
        if(q==null){
            l.next=p;
        }

        return root.next;
    }
}