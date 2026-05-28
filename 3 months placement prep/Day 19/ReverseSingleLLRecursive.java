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
    public ListNode reverseList(ListNode head) {

    //ITERATIVE THREE POINTER APPROACH

    //   if(head == null || head.next == null) return head;
    //   ListNode curr = head.next;
    //   ListNode prev = head;
    //   prev.next = null;
    //    while(curr != null) {
    //        ListNode  next = curr.next;
    //        curr.next = prev;
    //        head = curr;
    //        prev = curr;
    //        curr = next;
    //    } 

    //    return head;


    //RECURSIVE APPROACH - STACK FRAMING

        if(head == null || head.next == null){
            return head;
        }

        ListNode newNode = reverseList(head.next);

        head.next.next = head;

        head.next = null;

        return newNode;


    }
}