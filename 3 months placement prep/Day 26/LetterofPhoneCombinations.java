class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        StringBuilder s = new StringBuilder();

        HashMap<Character, List<Character>> map = new HashMap<>();

        map.put('2', Arrays.asList('a','b','c'));
        map.put('3', Arrays.asList('d','e','f'));
        map.put('4', Arrays.asList('g','h','i'));
        map.put('5', Arrays.asList('j','k','l'));
        map.put('6', Arrays.asList('m','n','o'));
        map.put('7', Arrays.asList('p','q','r','s'));
        map.put('8', Arrays.asList('t','u','v'));
        map.put('9', Arrays.asList('w','x','y','z'));


        combinations(digits, 0, list, s, map);

        return list;

    }

    public void combinations(String digits, int idx, List<String> strings, StringBuilder curr, HashMap<Character, List<Character>> map) {
        if(idx >= digits.length()) {
            strings.add(curr.toString());
            return;
        }

        
        List<Character> list = map.get(digits.charAt(idx));
        for(Character c: list) {
                combinations(digits, idx+1, strings, curr.append(c), map);
                curr.deleteCharAt(curr.length() - 1);
        }
        
        return;
    }
}