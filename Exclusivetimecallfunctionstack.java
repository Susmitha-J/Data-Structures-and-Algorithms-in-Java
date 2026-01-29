class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {

        int[] exclusivetime = new int[n];
        int prevTime = -1;
        int[] stack = new int[logs.size()];
        int top = -1;
        for(String log: logs){
            String tokens[] = log.split(":");
            int funcId = Integer.parseInt(tokens[0]);
            int currTime = Integer.parseInt(tokens[2]);

            if(tokens[1].equals("start")) {
                if(top >= 0) {
                    exclusivetime[stack[top]] += (currTime - prevTime);    
                }
               prevTime = currTime;
               stack[++top] = funcId;
            } else{
                exclusivetime[stack[top]] += (currTime - prevTime) + 1;
                top--;
                prevTime = currTime + 1;
            }
            
        }

        return exclusivetime;
        
    }
}