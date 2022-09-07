class Trie {
    
    ArrayList<String> list;

    public Trie() {
        list = new ArrayList<>();
    }
    
    public void insert(String word) {
        list.add(word);
    }
    
    public boolean search(String word) {
        return list.contains(word);
        
    }
    
    public boolean startsWith(String prefix) {
        for(int i = 0; i < list.size(); i++) {
            if(!(prefix.length() > list.get(i).length())) {
                if(list.get(i).substring(0,prefix.length()).equals(prefix)) return true;
            }
        }
       
       return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */