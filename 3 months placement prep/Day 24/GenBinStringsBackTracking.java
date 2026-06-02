class Solution {
    public List<String> validStrings(int n) {
    
        List<String> curr = new ArrayList(List.of("0","1"));
        
        
        if(n==1) return curr;

        // for(int i = 1; i<n;i++) {

        //         List<String> next = new ArrayList<>();
        //         for(String s: curr) {
        //             //if previous character is 1 we can add two 0 or 1
        //             if(s.length() == 0 || s.charAt(i-1) == '1') {
        //                 next.add(s + "0");
        //                 next.add(s + "1");
        //             } else if(s.charAt(i-1)!= '1') {
        //                 next.add(s + "1");
        //             }
        //         }

        //         curr = next;
        // }

        // return curr;

        StringBuilder s = new StringBuilder();
        List<String> list = new ArrayList<>();
        generate(list, s, n, 0);
        return list;
    }


    public void generate(List<String> list, StringBuilder s, int n, int idx) {
        if(idx == n) {
            list.add(s.toString());
            return;
        }

        if(s.length() == 0 || s.charAt(s.length() - 1) == '1') {
            s.append("0");
            generate(list, s, n, idx+1);
            s.deleteCharAt(s.length() - 1);
            s.append("1");
            generate(list, s, n, idx +1);
            s.deleteCharAt(s.length() -1);
        } else if(s.charAt(s.length() -1 ) != '1') {
            s.append("1");
            generate(list, s, n, idx + 1);
             s.deleteCharAt(s.length() - 1);
        }

        return;

    }
}