class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        
        int l = 0;
        int r = nums.length-1;
        
        
        while(l < r) {
            max = Math.max(max,nums[l] + nums[r]); 
                
            l++;
            r--;
        }
        return max;
    }
}