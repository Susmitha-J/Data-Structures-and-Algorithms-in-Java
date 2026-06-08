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
