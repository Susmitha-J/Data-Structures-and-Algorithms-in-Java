//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class rearrangeElementsBySign {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        int negativeArr[] = new int[n];
        int positiveArr[] = new int[n];
        int negCount=0, posCount = 0, i,j;
        
        for(i=0;i<n;i++){
            if(arr[i]<0){
                negativeArr[negCount++]= arr[i];
            } else {
                positiveArr[posCount++] = arr[i];
            }
        }
        
        int pos =0, neg = 0;
        
        for(i=0;i<n;i++){
            if(i%2==0){
                if(pos<posCount){
                    arr[i]= positiveArr[pos];
                    pos++;
                } else {
                    if(neg< negCount){
                        arr[i] = negativeArr[neg];
                        neg++;
                    }
                }
            } else{
                if(neg<negCount){
                    arr[i] = negativeArr[neg];
                    neg++;
                } else {
                    if(pos<posCount){
                        arr[i] = positiveArr[pos];
                        pos++;
                    }
                }
            }
            
        }
       
        
    }
}