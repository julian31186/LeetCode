class Solution {
    class Pair {
        char key;
        int value;
        
        public Pair(char key, int value) {
            this.key = key;
            this.value = value;
        }
        
    }
    public String frequencySort(String s) {
        //hashmap of char and int
        
        //arraylist of pairs of hashmap keya and value
        
        //sort the array list by pair value
        
        //add to output string highest to lowest
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        System.out.println(map);
        PriorityQueue<Pair> q = new PriorityQueue<>((a,b) -> Integer.compare(b.value, a.value));
        
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            q.add(new Pair(entry.getKey(),entry.getValue()));
        }
        
        String ans = "";

        while(!q.isEmpty()) {
            for(int i = 0; i < q.peek().value; i++) {
                ans += q.peek().key;
            }
            q.remove();
        }

        
        return ans;
    }
}