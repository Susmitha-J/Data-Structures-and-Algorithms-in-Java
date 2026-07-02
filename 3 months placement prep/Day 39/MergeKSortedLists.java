/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        Heap heap = new Heap();

        for (ListNode node : lists) {
            if (node != null) {
                heap.insert(node);
            }
        }

         
        while (!heap.isEmpty()) {

            ListNode node = heap.extractMin();

            tail.next = node;
            tail = tail.next;

            if (node.next != null) {
                heap.insert(node.next);
            }
        }

        return dummy.next;
    }
}

class Heap{
    ArrayList<ListNode> heap;
    Heap() {
        heap = new ArrayList<>();
    }
    
    public void heapifyUp(int idx) {
        
        while(idx > 0) {
            int parent = (idx - 1)/2;
            if(heap.get(parent).val <= heap.get(idx).val) {
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
            if(left < heap.size() && heap.get(left).val < heap.get(smallest).val) {
                smallest = left;
            }
            
            if(right < heap.size() && heap.get(right).val < heap.get(smallest).val) {
                smallest = right;
            }
            
            if(smallest == idx) {
                break;
            }
            
            swap(idx, smallest);
            idx = smallest;
        }
    }
    
    public void insert(ListNode node) {
        heap.add(node);
        heapifyUp(heap.size()-1);
        
    }
    
    public ListNode extractMin() {
         ListNode min = heap.get(0);
         ListNode last = heap.remove(heap.size()-1);
         
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
        ListNode temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
    
}