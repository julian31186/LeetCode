import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length() == 0) return true;
        if(s.length() % 2 != 0) return false;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                if(stack.isEmpty())  {
                    return false;
                } else if(s.charAt(i) == ')' && stack.peek() != '(' || s.charAt(i) == '}' && stack.peek() != '{' || s.charAt(i) == ']' && stack.peek() != '['  ) {
                    return false;

                    
                } else {
                    if(s.charAt(i) == ')' && stack.peek() == '(') stack.pop();
                    if(s.charAt(i) == '}' && stack.peek() == '{') stack.pop();
                    if(s.charAt(i) == ']' && stack.peek() == '[') stack.pop();
                }
            }
            
           
        }
        
        
        return stack.isEmpty();
    
    }
}
     
                      
            
                      

        
        
    
        
        
        
        

    

	


