class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // O(2*N)
        //return subsets(arr, sum, 0, 0);
        
        Boolean[][] dp = new Boolean[arr.length + 1][sum + 1];
       return subsets(arr,sum,0,0, dp);
    
    }
    
    public static Boolean subsets(int arr[], int sum, int currSum,int idx,  Boolean[][] dp){
        
            if(sum == currSum) {
                return true;
            }
            
            if(idx == arr.length) return false;
    
            if (currSum > sum) return false;
            
            
            if (dp[idx][currSum] != null)
                return dp[idx][currSum];
        
            boolean take = subsets(arr, sum, currSum + arr[idx], idx + 1, dp);
            boolean notTake = subsets(arr, sum, currSum, idx + 1, dp);
        
            dp[idx][currSum] = take || notTake;
            return dp[idx][currSum];
    }
}