class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set<Integer> union = new HashSet<>();
        int n = a.length, m = b.length;
        for(int i=0;i<n;i++){
            union.add(a[i]);
        }
        
        for(int i=0;i<m;i++) {
            union.add(b[i]);
        }
        
        ArrayList<Integer> myList = new ArrayList<>(union);
        
        return myList;
    }
}