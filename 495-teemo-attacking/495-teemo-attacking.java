class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;
        for(int i = 0; i < timeSeries.length-1; i++) {
            count += Math.min(timeSeries[i+1]-timeSeries[i],duration);
        }
        count += duration;
        
        
        return count;
    }
}

//1 2 3 4 5 6 7 8 9


//