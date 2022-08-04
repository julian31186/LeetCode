class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1 || nums.length == 0) return 0;
        
        int maxGap = 0;
        for(int i = 0; i < nums.length-1; i++) {
            maxGap = Math.max(maxGap , Math.abs(nums[i] - nums[i+1]));
        }
        
        return maxGap;
    }
}