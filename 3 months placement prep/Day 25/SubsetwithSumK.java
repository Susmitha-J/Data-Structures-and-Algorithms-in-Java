class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        return subsets(arr, sum, 0, 0);
    
    }
    
    public static boolean subsets(int arr[], int sum, int currSum,int idx){
        
            if(sum == currSum) {
                return true;
            }
            
            if(idx == arr.length) return false;
    
            if (currSum > sum) return false;
          
           
            boolean val = subsets(arr, sum, currSum + arr[idx], idx+1);
               if(val == true) return val;
           
            
           val =  subsets(arr, sum, currSum, idx+1);
           if(val == true) return val;
            
           return false;
        
    }
}