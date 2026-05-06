// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int temp = arr[0], n =  arr.length;
        for(int i = 0;i<n-1;i++) {
            arr[i] = arr[(i+1)%n];
        }
        arr[n-1] = temp;
    }
}