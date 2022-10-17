class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        Arrays.sort(strs);        
        for(String s : strs) System.out.println(s);
        String l = strs[0];
        String r = strs[strs.length-1];
        String ans = "";
        int count = 0;
        
        
        
        for(int i = 0; i < Math.min(l.length(),r.length()); i++) {
            if(l.charAt(i) == r.charAt(i)) count++;
            else break;
        }
        
        ans = l.substring(0, count);
        
        return count == 0 ? "" : ans;
        
}
}
        