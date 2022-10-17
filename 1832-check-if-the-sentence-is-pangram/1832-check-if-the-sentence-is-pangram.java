class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] letters = new int[26];
        
        for(int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            letters[c- 'a']++; 
        }
        
        for(int i : letters) {
            if(i < 1) return false;   
        }
        
        
        return true;
    }
}