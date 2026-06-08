class MyQueue {
    int rear = 0;
    int front = 0;
    private int[] Q;
    int capacity = 100;
    int count = 0;

    public MyQueue() {
        Q = new int[100];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }

    public void enque(int x) {
        if(isFull()) return;

        Q[rear] = x;
        rear = (rear + 1) % capacity;
        count++;
    }

    public void deque() {
        if(isEmpty()) return;

        int pop = Q[front];
        front = (front+1) % capacity;
        count--;
    }

    public int front() {
        if(isEmpty()) return -1;
        
        return Q[front];
    }

    public int rear() {
        if(isEmpty()) return -1;
        return Q[rear - 1 % capacity];
    } 
}
class MyStack {

    //costly push mechanism 
    MyQueue Q1, Q2;
    public MyStack() {
      Q1 = new MyQueue();
      Q2 = new MyQueue();
    }
    
    public void push(int x) {
        Q2.enque(x);
        while(!Q1.isEmpty()) {
            Q2.enque(Q1.front());
            Q1.deque();
        }

        MyQueue temp = Q1;
        Q1 = Q2;
        Q2 = temp;
    }
    
    public int pop() {
        int ele = Q1.front();
        Q1.deque();
        return ele;
    }
    
    public int top() {
        return Q1.front();
    }
    
    public boolean empty() {
        return Q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */