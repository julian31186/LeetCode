class Solution {
    class p {
        int key;
        int value;
        
        public p(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int max = 0;
        
        p ans = new p(0,0);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > ans.value) {
                ans.key = entry.getKey();
                ans.value = entry.getValue();
            }
        }
        return ans.key;
    }
}