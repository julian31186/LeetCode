class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        int [] answer = new int[2];
        
        while(nums[i] + nums[j] != target) {
            if(nums[i] + nums[j] > target) {
                j--;
                continue;
            }
            if(nums[i] + nums[j] < target) {
                i++;
                continue;
            }
        }
        
        answer[0] = i + 1;
        answer[1] = j + 1;
        
        
        return answer;
    }
}
