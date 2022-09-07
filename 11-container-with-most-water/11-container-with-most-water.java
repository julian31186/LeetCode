class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = Integer.MIN_VALUE;
        
        if(height.length == 0) return 0;
        
        while(i < j) {
            int min = Math.min(height[i], height[j]);
            int distance = j - i; 
            int area = min * distance;
            max = Math.max(max, area);
            
            if(height[i] < height[j]) {
                i++;
            }else if(height[j] < height[i]) {
                j--;
            } else {
                i++;
            }
            
        }

        return max;
    }
}