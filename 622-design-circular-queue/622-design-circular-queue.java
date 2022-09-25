class MyCircularQueue {
    Deque<Integer> deq;
    int size = 0;

    public MyCircularQueue(int k) {
        deq = new ArrayDeque<>(k);
        size = k;
    }
    
    public boolean enQueue(int value) {
        if(deq.size() != size) {
            deq.add(value);
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(!deq.isEmpty()) {
            deq.remove();
            return true;
        }
        return false;
        
    }
    
    public int Front() {
        if(deq.size() != 0) {
            return deq.getFirst();
        }
        return -1;
    }
    
    public int Rear() {
        if(deq.size() != 0) {
            return deq.getLast();
        }
        return -1;
    }
    
    public boolean isEmpty() {
        return deq.isEmpty();
    }
    
    public boolean isFull() {
       return deq.size() == size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */