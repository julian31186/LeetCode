class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i <  strs.length; i++) {
            char [] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            
            if(map.containsKey(str)) {
                map.get(str).add(strs[i]);
                
            } else {
                ArrayList<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                map.put(str,newList);
            }
            
           
            
        }
        
        ArrayList<List<String>> list = new ArrayList<>();
        for(List<String> trav : map.values()) {
            list.add(trav);
        }
        
        return list;
    }  
}
    
    
    
