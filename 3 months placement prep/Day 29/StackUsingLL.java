/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
*/
// Stack class
class myStack {
    Node head = null;
    int count;
    public myStack() {
     count = 0;
    }

    public boolean isEmpty() {
        // check if the stack is empty
       return  head == null;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        Node temp = new Node(x);
        if(head == null) {
            head = temp;
            count++;
            return;
        }
        
        temp.next = head;
        head = temp;
        count++;
    }

    public void pop() {
        // Removes the front element of the stack.
        if(head == null) return;
        head = head.next;
        count--;
        
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        
        if(head == null) return -1;
        
        return head.data;
    }

    public int size() {
        return count;
    }
}
