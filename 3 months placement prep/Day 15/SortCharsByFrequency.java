class Solution {
    public String frequencySort(String s) {
        // HashMap<Character, Integer> map = new HashMap<>();

        // for(int i=0;i<s.length();i++) {
        //    map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        // }

        // HashMap<Integer, List<Character>> bucketmap = new HashMap<>();
        // for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        //        char ch =  entry.getKey();
        //        int freq =  entry.getValue();

        //     bucketmap.computeIfAbsent(freq, k -> new ArrayList<>()).add(ch);

        // }

        // // Sort by keys
        // Map<Integer, List<Character>> sortedMap = new TreeMap<>(Collections.reverseOrder());
        // sortedMap.putAll(bucketmap);


        // StringBuilder result = new StringBuilder();
        // for (Map.Entry<Integer, List<Character>> entry : sortedMap.entrySet()) {
        //        int freq =  entry.getKey();
        //        List<Character>  list =  entry.getValue();

        //        for (char ch : list) {

        //             for (int i = 0; i < freq; i++) {
        //                 result.append(ch);
        //             }
        //       } 
        // }

        //  String finalResult = result.toString();

        //         return finalResult;


         // Step 1: Count frequency
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Create buckets
        List<Character>[] buckets = new ArrayList[s.length() + 1];

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {

            char ch = entry.getKey();
            int freq = entry.getValue();

            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }

            buckets[freq].add(ch);
        }

        // Step 3: Build answer
        StringBuilder result = new StringBuilder();

        for (int freq = buckets.length - 1; freq >= 1; freq--) {

            if (buckets[freq] != null) {

                for (char ch : buckets[freq]) {

                    for (int i = 0; i < freq; i++) {
                        result.append(ch);
                    }
                }
            }
        }

        return result.toString();
    }
}