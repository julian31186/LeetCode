class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> list = new ArrayList<>();
      HashMap<String,List<String>> map = new HashMap<>();
        
      for(int i = 0; i < strs.length; i++) {
          char[] c = strs[i].toCharArray();
          Arrays.sort(c);
          String sorted = new String(c);
          if(!map.containsKey(sorted)) {
              ArrayList<String> newList = new ArrayList<>();
              newList.add(strs[i]);
              map.put(sorted,newList);
          } else {
              map.get(sorted).add(strs[i]);
          }
      }  
        list.addAll(map.values());
        return list;
    }  
}
    
    
    
