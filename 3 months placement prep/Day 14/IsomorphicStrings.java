class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        for(int i = 0;i< s.length();i++) {
            char c = s.charAt(i);
            if(mapST.containsKey(c)) {
                if(mapST.get(c) != t.charAt(i)) return false;
            } else mapST.put(c, t.charAt(i));

            if(mapTS.containsKey(t.charAt(i))) {
                if(mapTS.get(t.charAt(i)) != c) return false;
            } else mapTS.put(t.charAt(i) , c);

        }

        return true;
    }
}