//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class DuplicateChars {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
        
        ArrayList<Character> strArray = new ArrayList<Character>();
        for(int i=0;i<str.length();i++) {
            if(!strArray.contains(str.charAt(i))){
                strArray.add(str.charAt(i));
            }
        }
        StringBuilder builder = new StringBuilder(strArray.size());
        for(Character ch: strArray)
        {
            builder.append(ch);
        }
        return builder.toString();
    }
}

