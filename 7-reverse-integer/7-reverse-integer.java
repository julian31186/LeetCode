class Solution {
    public int reverse(int x) {
        
        
        String intToString = String.valueOf(x);
        String reverse = "";
        
        if(intToString.charAt(0) == '-') {
            reverse += "-";
            intToString = intToString.substring(1);
        }
        for(int i = intToString.length()-1; i >= 0; i--) {
            reverse += intToString.charAt(i);
        }
            
        try {
            return Integer.valueOf(String.valueOf(reverse));
        } catch(NumberFormatException e) {
            return 0;
        }
        
        
    
    
    }
}
        
    
