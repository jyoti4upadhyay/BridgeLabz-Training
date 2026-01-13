class Queue {
    String[] que;
    int front = 0, rear = -1, size, capacity;

    Queue(int capacity) {
        this.capacity = capacity;
        que = new String[capacity];
    }

    boolean Full() {
        return size == capacity;
    }

    boolean Empty() {
        return size == 0;
    }

    void enqueue(String vehicle) {
        if (Full()) {
            System.out.println("Queue Overflow! Cannot add " + vehicle);
            return;
        }
        rear = (rear + 1) % capacity;
        que[rear] = vehicle;
        size++;
        System.out.println( " " + vehicle + " added to waiting queue");
    }

    String dequeue() {
        if (Empty()) {
            System.out.println(" Queue Underflow! No vehicle waiting");
            return null;
        }
        String vehicle = que[front];
        front = (front + 1) % capacity;
        size--;
        return vehicle;
    }
}
