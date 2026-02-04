class Solution {
    public int hIndex(int[] citations) {
    
        int len = citations.length;
        Arrays.sort(citations);
         // reversing the array with sorted elements
        for (int i = 0; i < len / 2; i++) {
            int temp = citations[i];
            citations[i] = citations[len - 1 - i];
            citations[len - 1 - i] = temp;
        }

        int i=0;
        while(i < citations.length) {
            if(citations[i] < i+1) return i;

            i++;
        }

        return i;
        
    }
}