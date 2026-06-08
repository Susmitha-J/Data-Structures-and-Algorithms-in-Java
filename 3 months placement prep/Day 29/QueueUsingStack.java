class MyStack {
    int stack[];
    int capacity;
    int top;

    public MyStack() {
        capacity = 100;
        stack = new int[100];
        top = -1;
    
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int x) {
        if(isFull()) return;

        stack[++top] = x;
    }

    public int  pop() {
        if(isEmpty()) return -1;

        int ele = stack[top];
        top--;
        return ele;
    }

    public int peek() {
        if(isEmpty()) return -1;
        
        return stack[top];
    }

}
class MyQueue {
    MyStack S1, S2;
    public MyQueue() {
        S1 = new MyStack();
        S2 = new MyStack();
    }
    
    public void push(int x) {
        S1.push(x);
    }
    
    public int pop() {
        if(S2.isEmpty()) {
            while(!S1.isEmpty()) {
                int top = S1.peek();
                S2.push(top);
                S1.pop();
            }
        }

        if(S2.isEmpty()) return -1;

        int top = S2.peek();
        S2.pop();
        return top;
    }
    
    public int peek() {
        
        if(S2.isEmpty()) {
            while(!S1.isEmpty()) {
                int top = S1.peek();
                S2.push(top);
                S1.pop();
            }
        }

        if(S2.isEmpty()) return -1;

        int top = S2.peek();
        return top;
    }
    
    public boolean empty() {
         return S1.isEmpty() && S2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */