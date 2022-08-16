class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        
        String [] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        
        for(int i = 0; i < pattern.length(); i++) {
            if(!map1.containsKey(pattern.charAt(i))) {
                if(!map2.containsKey(words[i])) {
                    map1.put(pattern.charAt(i), words[i]);
                    map2.put(words[i],pattern.charAt(i) );
                } else {
                    return false;
                }

            } else if(!map1.get(pattern.charAt(i)).equals(words[i])) {
                return false;
            }
        }
       return true;
    }
}