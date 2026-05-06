class Solution {
    public int lastStoneWeight(int[] stones) {


        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        //building heap

        for(int i = 0;i< stones.length;i++) {
            maxHeap.add(stones[i]);
        }

        while(maxHeap.size() > 1) {
            Integer x = maxHeap.poll();
            Integer y = maxHeap.poll();

            if(null == x) return y;
            else if(null == y) return x;

            if(x != y)  {
                if(x > y ) maxHeap.add(x-y);
                else maxHeap.add(y-x);
            }

           
        }

        return (maxHeap.size() !=0) ? maxHeap.poll() : 0;
   
    }

    // public int[] buildHeap(int[] stones){
    //     int[] heap = new int[stones.length+1];

    //     int j = 1;
    //     for(int i = 0;i< stones.length;i++){
            
    //     }

    // }
}