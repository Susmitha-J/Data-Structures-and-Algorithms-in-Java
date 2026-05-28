/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        if(head == null || head.next == null) return 0;
        // code here
    
        
        Node slow = head;
        Node fast = head;
        
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) {
                //find the start of cycle;
               int cyclelen = 1;
               Node temp = slow.next;
               while(temp != slow) {
                   cyclelen++;
                   temp = temp.next;
               }
                
                return cyclelen;
                
            }
        }
        
        return 0;
        
    }
}