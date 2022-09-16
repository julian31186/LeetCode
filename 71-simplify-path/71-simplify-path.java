class Solution {
    public String simplifyPath(String path) {
        String [] words = path.split("/");
        Stack<String> stack = new Stack<>();
        
        for(String s : words) {
            if(s.equals("") || s.equals(".")) continue;
            if(s.equals("..")) {
                if(!stack.isEmpty()) stack.pop();
            }
            else stack.push("/" + s); 
            
            
        }

        String ans = "";
        if(stack.isEmpty()) return "/";
        while(!stack.isEmpty()) {
            ans = stack.pop() + ans;
        }
        
        
        return ans;
    }
}