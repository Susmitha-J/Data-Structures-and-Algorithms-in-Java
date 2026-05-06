//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class ArraySubset {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a1[] = new long[(int)(n)];
            long a2[] = new long[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Compute obj = new Compute();
            System.out.println(obj.isSubset( a1, a2, n, m));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long, Integer> frequencyA1 = getFrequencyHashMap(a1,(int)n);
        HashMap<Long, Integer> frequencyA2 = getFrequencyHashMap(a2,(int)m);
        for(int i =0;i<m;i++){
            if(!frequencyA1.containsKey(a2[i]) || frequencyA1.get(a2[i]) < frequencyA2.get(a2[i])) {
                return "No";
            }
        }
        return "Yes";
        
    }
    public HashMap<Long, Integer> getFrequencyHashMap(long a[], int size){
         HashMap<Long, Integer> frequency = new HashMap<Long, Integer>();
         for(int i=0; i< size;i++){
             frequency.put(a[i], frequency.getOrDefault(a[i], 0) + 1);
         }
         return frequency;
    }
    
}