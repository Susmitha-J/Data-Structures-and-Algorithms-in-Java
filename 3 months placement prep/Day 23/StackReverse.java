class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()) return;
        
        int stacktop = st.pop();
        reverseStack(st);
        
        insertBottom(st, stacktop);
        
    }
    
    public static void insertBottom(Stack<Integer> st, int element) {
        if(st.isEmpty()) {
            st.push(element);
            return;
        } 
        
        int top = st.pop();
        insertBottom(st, element);
        
        st.push(top);
    }
}
