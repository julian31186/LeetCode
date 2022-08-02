class Solution {
    public int[] twoSum(int[] nums, int target) {
      int sum = 0;
      int [] position = new int[2];  
        
      for(int i = 0; i < nums.length; i++) {
          for(int j = i+1; j < nums.length; j++) {
              if(nums[i] + nums[j] == target) {
                  position[0] = i;
                  position[1] = j;
                  return position;
              } 
          }
      }
        //leethub test
        return position;
    }
}