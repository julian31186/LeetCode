class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;
        
        //REDO ONCE WAKE UP
        while(j < s.length()) {
            if(map.containsKey(s.charAt(j))) {
                if(map.get(s.charAt(j)) + 1 >= i) {
                    i = map.get(s.charAt(j)) + 1;
                }
            }
            map.put(s.charAt(j),j);
            max = Math.max(max, j - i + 1);
            j++;
        }
 
        
        return max;
    }
}