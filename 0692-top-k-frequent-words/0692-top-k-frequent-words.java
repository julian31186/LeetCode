class Solution {
    class Pair{
        String word;
        int count;
        
        public Pair(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        PriorityQueue<Pair> pqueue = new PriorityQueue<>((a,b) -> b.count == a.count ? a.word.compareTo(b.word) : b.count - a.count);
        
        
        for(int i = 0; i < words.length; i++) {
            if(map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            } else {
                map.put(words[i], 1);
            }
        }
        
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            Pair pair = new Pair(entry.getKey(), entry.getValue());
            pqueue.add(pair);
        }
        
        while(k > 0 && !pqueue.isEmpty()) {
            list.add(pqueue.remove().word);
            k--;
        }    
            
        return list;
    }
}