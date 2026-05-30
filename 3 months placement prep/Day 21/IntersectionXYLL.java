/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Space complexity n - time = 2n
        // HashMap<ListNode, Integer> map = new HashMap<>();

        // ListNode temp = headA;
        // int idx = 0;
        // while(temp != null) {
        //     map.put(temp, idx++);
        //     temp = temp.next;
        // }

        // temp = headB;
        // idx = 0;
        // while(temp != null) {
        //     if(map.containsKey(temp)) return temp;
        //     temp = temp.next;
        // }

        // return null;

        //space 1 time n+m

        if(headA == null || headB == null) return null;

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;

            if(temp1 == temp2) return temp1;

            if(temp1 == null) temp1 = headB;
            if(temp2 == null) temp2 = headA;
        
        }

        return temp1;

    }
}