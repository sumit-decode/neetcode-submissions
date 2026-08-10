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
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int target=count-n;
        if(target==0){
            return head.next;
        }
        else{
        temp=head;
        while(temp!=null && temp.next!=null){
            target--;
            if(target==0){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
        }
        return head;
        
    }
}
