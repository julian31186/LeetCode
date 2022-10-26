class Solution {
    public int smallestEvenMultiple(int n) {
        for(int i = 1; i < 150; i++) {
            if(n * i % 2 == 0) return n * i;
        }
        return -1;
    }
}