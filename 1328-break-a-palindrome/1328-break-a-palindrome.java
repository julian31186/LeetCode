class Solution {
    public String breakPalindrome(String s) {
        if(s.length() == 1) return "";
        
        StringBuilder sb = new StringBuilder(s);
        
        for(int i = 0; i < sb.length()/2; i++) {
            if(sb.charAt(i) != 'a') {
                sb.replace(i,i+1,"a");
                return sb.toString();
            }
        }
        
        sb.replace(sb.length()-1, sb.length(), "b");
        
        return sb.toString();
    }
}