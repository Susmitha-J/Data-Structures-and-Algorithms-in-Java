// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int n = arr.length, temp =  arr[n-1], i;
        for(i=n-1;i>0;i--) {
            arr[i] = arr[(i-1+n)%n];
        }
        arr[i] = temp;

    }
}