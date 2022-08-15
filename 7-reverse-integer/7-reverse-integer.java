class Solution {
    public int reverse(int x) {
        String num = String.valueOf(x);
        String ans = "";
        if(num.charAt(0) == '-') ans += num.charAt(0);
        
        for(int i = num.length()-1; i>= 0; i--) {
            ans += num.charAt(i);
        }
        ans = ans.substring(0, num.length());
        
        try {
           return Integer.valueOf(ans); 
        } catch(Exception e) {
            return 0;
        }
        
    
    }
}
        
    
