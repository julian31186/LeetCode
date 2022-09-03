class Solution {
    public String removeStars(String s) {
        
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '*') stack.push(s.charAt(i));
            else if(s.charAt(i) == '*') stack.pop();
        }
        
        StringBuilder temp = new StringBuilder("");
        while(!stack.isEmpty()) {
            temp.append(stack.pop());
        }
        String ans = temp.reverse().toString();
        return ans;
    }
}   