class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < words.length; i++) {
            if(map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            } else {
                map.put(words[i] , 1);
            }
        }
        ArrayList<String> list = new ArrayList<>(map.keySet());
       
        Collections.sort(list, (w1, w2) -> map.get(w1) == map.get(w2) ? w1.compareTo(w2) : map.get(w2) - map.get(w1));
        
        
        
        return list.subList(0,k);
        
        
    }
}