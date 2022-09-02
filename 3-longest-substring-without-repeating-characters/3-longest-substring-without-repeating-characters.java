class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = 0;
        
        
        if(s.length() == 0) return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        
        
        
        while(j < s.length()) {

            if(map.containsKey(s.charAt(j))) {
                if(map.get(s.charAt(j)) >= i) {
                   i = map.get(s.charAt(j)) + 1; 
                }
            }
            map.put(s.charAt(j), j);
            max = Math.max(max, j-i + 1);
            
            j++;
        }
        
        return max;
    }
}