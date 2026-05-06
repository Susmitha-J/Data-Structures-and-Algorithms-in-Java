class MyQueue {
    int stack1[] = new int[100];
    int stack2[] = new int [100];
    int top1 = -1, top2 = -1;
    public MyQueue() {
        
    }
    
    public void push(int x) {

        while(top1 != -1) {
            stack2[++top2] = stack1[top1--];
        }
        stack1[++top1] = x;

        while(top2!= -1) {
            stack1[++top1] = stack2[top2--];
        }
        
    }
    
    public int pop() {
        int val = stack1[top1];
        top1--;
        return val;
    }
    
    public int peek() {
        return stack1[top1];
    }
    
    public boolean empty() {
        if(top1 == -1 ) return true;

        return false;
    }
}
