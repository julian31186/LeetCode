class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        
        
        for(String s : strs) {
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String word = new String(c);
            
            if(map.containsKey(word)) {
                map.get(word).add(s);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                map.put(word, list);
            }
        }
        
        
        for(List<String> lists : map.values()) {
            ans.add(lists);
        }
        

        return ans;
    }  
}
    
    
    
