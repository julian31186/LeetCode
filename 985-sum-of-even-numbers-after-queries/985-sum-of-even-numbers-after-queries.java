class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {

        int sum = 0;
        int ind = 0;
        
        int [] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) sum += nums[i];
        }

        
        for(int [] arr : queries) {
            int index = arr[1];
            int var = arr[0];
            if(nums[index] % 2 == 0) {
                sum -= nums[index];
            }
            
            nums[index] += var;
            
            if(nums[index] % 2 == 0) sum += nums[index];
            
            
            ans[ind]  = sum;
            ind++;
        }
        return ans;
        
    }
}