/* Structure of doubly linked list node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        Node temp = head;
        while(temp!= null){
            
            Node prev = temp.prev;
            Node next = temp.next;
            
            temp.prev = temp.next;
            temp.next = prev;
            
            head = temp;
            temp = next;
        }
        
        
        return head;
    }
}