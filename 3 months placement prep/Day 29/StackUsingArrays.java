class myStack {
    
    List<Integer> stack;
    int stackSize;

    public myStack(int n) {
        stack = new ArrayList<>();
        stackSize = n;
    }

    public boolean isEmpty() {
        if(stack.size() == 0) {
            return true;
        } else{
            return false;
        }
    }

    public boolean isFull() {
        if(stack.size() == stackSize) {
            return true;
        }else {
            return false;
        }
    }

    public void push(int x) {
       if(isFull()) return; 
       
       stack.add(x);
       return;
    
    }

    public void pop() {
      if(isEmpty()) return;
      else stack.remove(stack.size()-1);
    }

    public int peek() {
       if(isEmpty()) return -1;
       else{
           return stack.get(stack.size()-1);
       }
    }
}