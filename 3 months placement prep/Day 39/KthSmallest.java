class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
         Heap heap = new Heap(k);
        for(int i : arr) {
            heap.insert(i);
        }

        return heap.getKthSmallest();
    }
    
    
}

class Heap{
    ArrayList<Integer> heap;
    int maxCapacity;

    Heap(int k) {
        heap = new ArrayList<>();
        maxCapacity = k;
    }

    public void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public void heapifyUp() {
        if(heap.size() == 0) return;
        int idx = heap.size()-1;
        while(idx > 0) {
            int parent = (idx - 1)/2;
            if(heap.get(parent) >= heap.get(idx)) {
               break;
            } 
            swap(parent, idx);
            idx = parent;
        }
    }

    public void heapifyDown() {
        if(heap.size() == 0) return;
        int parent = 0;
        while(true) {
            int left = 2 * parent + 1;
            int right = 2* parent + 2;
            int smallest = parent;
            if(left < heap.size() && heap.get(left) > heap.get(smallest)) {
                smallest = left;
            } 

            if(right < heap.size() && heap.get(right) > heap.get(smallest)) {
                smallest = right;
            }

            if(smallest == parent) {
                break;
            }
            swap(smallest, parent);
            parent = smallest;
        }

    }

    public void insert(int val) {
       

        // Heap not full yet
        if (heap.size() < maxCapacity) {
            heap.add(val);
            heapifyUp();
            return;
        }

        // Ignore if not among top k
        if (val >= heap.get(0))
            return;

        // Replace root val > root
        heap.set(0, val);
        heapifyDown();
    }

    public int getKthSmallest() {
        return heap.get(0);
    }
    
}
