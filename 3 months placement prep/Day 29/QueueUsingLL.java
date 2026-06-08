// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    Node front = null;
    Node rear = null;
    int count = 0;
    public myQueue() {
        // Initialize your data members
    }

    public boolean isEmpty() {
       return rear == null && front == null;
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        Node temp = new Node(x);
        if(front == null) {
            front = temp;
            rear = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
        count++;
    }

    public void dequeue() {
        // Removes the front element of the queue
        if(front == null) return;
        
        if(front == rear) {
            front = front.next;
            rear = rear.next;
            count--;
            return;
        }
        
        front = front.next;
        count--;
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        
        if(front == null) return -1;
        
        return front.data;
    }

    public int size() {
        // Returns the current size of the queue.
        return count;
    }
}
