class Solution {
    public int minPartitions(String n) {
        int max = 0;
        char [] chars = n.toCharArray();
        for(char c : chars) {
            max = Math.max(max, Integer.valueOf(String.valueOf(c)));
            
        }
        return max;
    }
}