class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        
        //a triangle is valid if a + b > c
        for(int i = nums.length-3; i >= 0; i--) {
            if(nums[i] + nums[i+1] > nums[i+2]) {
                return nums[i] + nums[i+1] + nums[i+2];
            }
            
        }
        
        return 0;
    }
}