class Solution {
    // public boolean isMaxHeap(int[] arr) {
    //     // code here
    //     return isMaxHeap(arr, 0);
    // }
    
    //recursive
    public boolean isMaxHeap(int[] arr, int parent) {
        
        if(parent >= arr.length)  return true;
        
        int left = 2 * parent + 1;
        int right = 2 * parent + 2;
            
        if((left < arr.length && arr[parent] < arr[left])) return false;
    
        if((right < arr.length && arr[parent] < arr[right])) return false;
        
       return isMaxHeap(arr, left) && isMaxHeap(arr, right);
        
    }
    
    //iterative
    public boolean isMaxHeap(int[] arr) {
        for(int i =0;i<= (arr.length - 2)/2; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if((left < arr.length && arr[i] < arr[left]) ||
            (right < arr.length && arr[i] < arr[right])) return false;
        }
        
        return true;
    }

}