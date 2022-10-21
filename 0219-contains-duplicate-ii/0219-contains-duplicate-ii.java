class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean flag = false;
        
        
        for(int i =0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                if(Math.abs(i - map.get(nums[i])) <= k) flag = true;
            } 
            map.put(nums[i], i);
            }
        
        
        
        return flag;
    }
}