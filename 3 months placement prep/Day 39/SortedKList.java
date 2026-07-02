class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        Heap heap = new Heap();
        //build heap until k+1 elements 
        for(int i = 0; i< k+1;i++) {
            heap.insert(arr[i]);
        }
        
        //build rest of element
        int idx = 0;
        for(int i = k+1;i< arr.length;i++) {
           arr[idx++] = heap.extractMin();
           heap.insert(arr[i]);
        }
        
        while(!heap.isEmpty()) {
            arr[idx++] = heap.extractMin();
        }
    
    }
}

class Heap{
    ArrayList<Integer> heap;
    
    Heap() {
        heap = new ArrayList<>();
    }
    
    public void heapifyUp(int idx) {
        
        while(idx > 0) {
            int parent = (idx - 1)/2;
            if(heap.get(parent) <= heap.get(idx)) {
                break;
            }
      
            swap(idx, parent);
            idx = parent;
        }
    }
    
    public void heapifyDown(int idx) {
        while(true) {
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;
            int smallest = idx;
            if(left < heap.size() && heap.get(left) < heap.get(smallest)) {
                smallest = left;
            }
            
            if(right < heap.size() && heap.get(right) < heap.get(smallest)) {
                smallest = right;
            }
            
            if(smallest == idx) {
                break;
            }
            
            swap(idx, smallest);
            idx = smallest;
        }
    }
    
    public void insert(int val) {
        heap.add(val);
        heapifyUp(heap.size()-1);
        
    }
    
    public int extractMin() {
         int min = heap.get(0);
         int last = heap.remove(heap.size()-1);
         
         if(!isEmpty()){
             heap.set(0, last);
             heapifyDown(0);
         }
         return min;
    }
    
    public boolean isEmpty() {
        return heap.size() == 0;
    }
    
    public void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
    
}