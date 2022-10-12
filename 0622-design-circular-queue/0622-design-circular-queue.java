class MyCircularQueue {
    int [] arr;
    int front;
    int rear;
    int size;
    int max_size;
    public MyCircularQueue(int k) {
        arr = new int[k];
        front = 0;
        rear = -1;
        size = 0;
        max_size = k;
    }
    
    public boolean enQueue(int value) {
        if(size == max_size) return false;   
        rear = (rear + 1) % max_size;
        arr[rear] = value;
        size++;
        
        return true;
    }
    
    public boolean deQueue() {
        if(size == 0) return false;
        arr[front] = -1;
        size--;
        front = (front+1) % max_size;
        return true;
    }
    
    public int Front() {
        if(size == 0) return -1;
        return arr[front];
    }
    
    public int Rear() {
        if(size == 0) return -1;
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
       return size == max_size;
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