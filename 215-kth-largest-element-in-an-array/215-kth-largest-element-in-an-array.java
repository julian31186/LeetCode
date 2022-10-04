class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length == 0) return 0;
        PriorityQueue<Integer> pqueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums) pqueue.add(i);
        
        int i = 0;
        while(i < k - 1) {
            pqueue.remove();
            i++;
        }      
        
        return pqueue.peek();
    }
}

// 1 2 3 4 5 6