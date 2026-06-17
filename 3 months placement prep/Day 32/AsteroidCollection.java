class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0;i< asteroids.length;i++) {
            int curr = asteroids[i];
            boolean alive = true;
            while(alive && !stack.isEmpty() &&  (stack.peek() > 0 && curr < 0)) {
               int top = Math.abs(stack.peek());
               int cur = Math.abs(curr);

               if(top > cur) {
                 alive = false;
               } else if(top == cur) {
                 stack.pop();
                 alive = false;
               } else{
                 stack.pop();
               }

            }
            if(alive) stack.push(curr);
    
        }

        int[] arr = stack.stream()
                 .mapToInt(Integer::intValue)
                 .toArray();

        return arr;
    }
}