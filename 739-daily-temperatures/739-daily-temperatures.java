class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] temps = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = temperatures.length-1; i >= 0; i--) {
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                temps[i] = 0;
            } else {
                temps[i] = stack.peek() - i;
            }
            //test
            stack.push(i);
        }
        
     
        return temps;
    }

}

        
    
