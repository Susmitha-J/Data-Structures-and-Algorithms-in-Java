class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here 
        int rightleader = arr[arr.length-1];
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders.add(rightleader);
        for(int i = arr.length - 2;i >=0 ;i--){
            if(arr[i] >= rightleader) {
                rightleader = arr[i];
                leaders.add( rightleader);
            }
        }
        
        
        Collections.reverse(leaders);
       
       return leaders;
    }
}
