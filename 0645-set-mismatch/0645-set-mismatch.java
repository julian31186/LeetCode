class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        int max = nums[nums.length-1];
        
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                ans[0] = nums[i];
            } else {
                set.add(nums[i]);
            }
            
        }
        
        System.out.println(set);
        
        for(int i = 1; i <= nums.length; i++) {
            System.out.println(i);
            if(!set.contains(i)) {
                ans[1] = i;
            }
        }
        
        
        
        
        
        return ans;
    }
}

// 1 2 2 3 4 5 6 7 8 9