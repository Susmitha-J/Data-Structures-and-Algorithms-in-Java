class Solution {
    public int beautySum(String s) {
        
        int count = 0;
        
        int n = s.length();

        for(int i=0;i<n;i++) {
            int freq[] = new int[26];
    
            for(int j=i;j<n;j++){
                int idx = s.charAt(j) - 'a';
                freq[idx]++;
                int max = 0;
                int min = 501;
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }
                }

                count += (max - min);
            }
        }
        return count;
    }
}