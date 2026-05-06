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
        if(list1 == null && list2 == null ) return list1;
        else if(list2 == null) return list1;
        else if(list1 == null) return list2;

        ListNode pointer1 = list1;
        ListNode pointer2 = list2;

        ListNode newList = new ListNode(0);
        ListNode currPointer = newList;

        while(pointer1 != null && pointer2 != null) {
            if(pointer1.val <= pointer2.val) {
                newList.next = pointer1;
                pointer1 = pointer1.next;
            } else {
                newList.next = pointer2;
                pointer2 = pointer2.next;
            }
            newList = newList.next;
        }

        while(pointer1!=null) {
            newList.next = pointer1;
            pointer1 = pointer1.next;
            newList = newList.next;
        }

         while(pointer2!=null) {
            newList.next = pointer2;
            pointer2 = pointer2.next;
            newList = newList.next;
        }

        return currPointer.next;



    }
}