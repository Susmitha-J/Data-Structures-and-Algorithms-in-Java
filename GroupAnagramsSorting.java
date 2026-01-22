class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();

        for(int i=0;i<strs.length;i++) {
            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);
            String val = String.valueOf(arr);
            map.computeIfAbsent(val, k -> new ArrayList<>()).add(strs[i]);
        }

        map.values().stream().forEach(value -> list.add(value));

        return list;

    }
}