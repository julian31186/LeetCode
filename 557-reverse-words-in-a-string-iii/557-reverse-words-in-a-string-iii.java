class Solution {
    public String reverseWords(String s) {
        String [] words = s.split(" ");
        String ans = "";
        for(String string : words) {
            StringBuilder sb = new StringBuilder(string);
            sb.reverse();
            ans += sb.toString() + " ";
            
        }
        ans = ans.substring(0,ans.length()-1);
        
        return ans;
    }
}