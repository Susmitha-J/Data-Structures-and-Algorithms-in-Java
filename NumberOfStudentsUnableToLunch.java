class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int binary[] = new int[2];

        for(int i: students) {
            binary[i]++;
        }

        for(int i: sandwiches) {
           if(binary[i] == 0) { break;}
           binary[i]--;
        }
    
        return binary[0] + binary[1];
    }
}