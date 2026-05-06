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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slowPointer = head;
        ListNode fastPointer = head.next;

        while(slowPointer != null && fastPointer!= null) {
            slowPointer = slowPointer.next;
            if(null == fastPointer.next || null == fastPointer.next.next) return false;
            fastPointer = fastPointer.next.next;
            if(slowPointer == fastPointer) return true;
        }

        return false;

     

    }
}