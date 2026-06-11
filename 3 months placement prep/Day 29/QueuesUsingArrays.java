class myQueue {

    List<Integer> list = new ArrayList<>();
    int size;
    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        size = n;
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        // Check if queue is empty
        if(list.size() == 0) return true;
        else return false;
    }

    public boolean isFull() {
        // Check if queue is full
        if(list.size() == size) return true;
        else return false;
    }

    public void enqueue(int x) {
        // Enqueue
       if(isFull()) return;
       list.add(x);
    }

    public void dequeue() {
        // Dequeue
        if(isEmpty()) return;
        
        list.remove(list.get(0));
    }

    public int getFront() {
       if(isEmpty()) return -1;
       else  return list.get(0);
    }

    public int getRear() {
        if(isEmpty()) return -1;
        else return list.get(list.size()-1);
    }
}


class myQueue {

    private int[] arr;
    private int front;
    private int rear;
    private int count;
    private int capacity;
    // Constructor
    public myQueue(int n) {
        
        arr = new int[n];
        capacity = n;
        rear = 0;
        front = 0;
        count = 0;
    }

    public boolean isEmpty() {
       return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }

    public void enqueue(int x) {
      if(isFull()) return;
      
      arr[rear] = x;
      rear = (rear + 1) % capacity;
      count++;
    }

    public void dequeue() {
        // Dequeue
        if(isEmpty()) return;
        
        front = (front + 1) % capacity;
        count--;
    }

    public int getFront() {
      if(isEmpty()) return -1;
      
      return arr[front];
    }

    public int getRear() {
        if(isEmpty()) return -1;
        
       int idx = (rear - 1 + capacity) % capacity;
       return arr[idx];
    }
}

