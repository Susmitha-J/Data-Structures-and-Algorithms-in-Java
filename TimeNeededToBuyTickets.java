class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        int time = 0;
        int n = tickets.length;
        int i = 0;
        while(tickets[k] != 0) {
            if(tickets[i%n]!= 0) {
                tickets[i%n]--;
                time++;
            } 
            i++;
        }

        return time;
        
    }
}