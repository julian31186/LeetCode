class KthLargest {
    PriorityQueue<Integer> q;
    int length = 0;

    public KthLargest(int k, int[] nums) {
        q = new PriorityQueue<>();
        for(int i : nums) q.add(i);
        length = k;
    }
    
    public int add(int val) {
        q.add(val);
        if(q.size() >= length) {
            while(q.size() != length) q.remove();
        }
        return q.peek();
    }
    
    
    
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */