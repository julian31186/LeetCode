class Solution {
    public int lastStoneWeight(int[] stones) {
        
        if(stones.length == 0) {
            return 0;
        }
        
        PriorityQueue<Integer> pqueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones) pqueue.add(i);
        
        while(pqueue.size() >= 2) {
            int stone = pqueue.remove() - pqueue.remove();
            if(stone == 0) {
                continue;
            } else {
                pqueue.add(stone);
            }
        }
        
        if(pqueue.isEmpty()) return 0;
        
        return pqueue.peek();
    }
}

//1 1 2 4 7 8

//1 1 1 2 4

//1 1

// 1 1 1

// 1

//2 2



