class Solution {

    private ArrayList<Integer> heap;
    
    public void initializeHeap() {
        heap = new ArrayList<>();
    }

    public void swap(int idx, int parent) {
        int temp = heap.get(idx);
        heap.set(idx, heap.get(parent));
        heap.set(parent, temp);
    }

    public void heapifyUp(int idx) {
        while(idx > 0) {
            int parent = (idx - 1)/2;
            if(heap.get(parent) > heap.get(idx)) {
                swap(parent, idx);
            } else{
                break;
            }
            idx = parent;
        }

    }

    public void heapifyDown(int idx) {
    int parent = idx;
      while(true){
        
            int left = 2 * parent + 1;
            int right = 2 * parent + 2;
            int curr = parent;

            if (left < heap.size() && heap.get(left) < heap.get(curr)) {
                curr = left;
            }

            if (right < heap.size() && heap.get(right) < heap.get(curr)) {
                curr = right;
            }

            if (curr == parent) {
                break;
            }
            swap(parent, curr);
            parent = curr;
      }
    }

    public void heapify(int index) {
        int parent = (index - 1) / 2;

        if (index > 0 && heap.get(index) < heap.get(parent))
            heapifyUp(index);
        else
            heapifyDown(index);
    }

    public void insert(int key) {
        heap.add(key);
        heapify(heap.size()-1);
    }

    public void changeKey(int index, int newVal) {
        heap.set(index, newVal);
        heapify(index);
    }

    public void extractMin() {

        if (heap.isEmpty()) return;

        int last = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapifyDown(0);
        }
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int getMin() { 
       return heap.get(0);
    }

    public int heapSize() {
        return heap.size();
    }
}