class Solution {
    public String minWindow(String s, String t) {
        

        HashMap<Character, Integer> tmap = new HashMap<>();
        HashMap<Character, Integer> smap = new HashMap<>();

        for(int i = 0;i < t.length();i++) {
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i),0) +1);
        }

        int left = 0, right = 0;
        StringBuilder minwin = new StringBuilder();
        int min = Integer.MAX_VALUE;

        int formed = 0;
        int required = tmap.size();

        int start = 0;

        while(right < s.length()) {
            char rightch = s.charAt(right);
            smap.put(rightch, smap.getOrDefault(rightch, 0)+1);
        
            if (tmap.containsKey(rightch) &&
                smap.get(rightch).intValue() == tmap.get(rightch).intValue()) {
                formed++;
            }

            while(formed == required) {
                if(right - left + 1 < min) {
                    min = right - left + 1;
                    start = left;
                }

                char leftch = s.charAt(left);
             
                smap.put(leftch, smap.get(leftch)-1);
                if (tmap.containsKey(leftch) &&
                    smap.get(leftch).intValue() < tmap.get(leftch).intValue()) {
                    formed--;
                }

                left++;

            }

            right++;

        }

        return min == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + min);


    }
}