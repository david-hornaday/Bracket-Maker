package edu.noctrl.sp26.project;

public class GameQueue implements Queue {
    private static final int DEFAULT_SIZE = 16;

    private Game queueArray[]; // Array holding queue elements
    private int maxSize; // Maximum size of queue
    private int front; // Index of front element
    private int rear; // Index of rear element

    /**
     * Creates an array-based queue with the given capacity.
     * 
     * @param capacity the number of elements the queue can hold.
     */
    GameQueue(int capacity) {
        maxSize = capacity + 1; // One extra space is allocated
        queueArray = new Game[maxSize]; // Create queueArray

        rear = 0;
        front = 1;
    }

    GameQueue() {
        this(DEFAULT_SIZE);
    }

    private boolean isFull() {
        return (rear + 2) % maxSize == front;
    }

    private void resizeQueue() {
        int newMaxSize = maxSize * 2;
        Game[] copy = new Game[newMaxSize];
        int size = length();

        for (int i = 0; i < size; i++) {
            copy[i + 1] = queueArray[(front + i) % maxSize];
        }
        queueArray = copy;
        front = 1;
        rear = size;
        maxSize = newMaxSize;
    }

    @Override
    public void clear() {
        int size = length();
        int index = front;

        for (int i = 0; i < size; i++) {
            queueArray[index] = null;
            index = (index + 1) % maxSize;
        }

        front = 1;
        rear = 0;
    }

    @Override
    public boolean enqueue(Game it) {
        if (isFull()) {
            resizeQueue();
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = it;
        return true;
    }

    @Override
    public Game dequeue() {
        if (length() == 0)
            return null;
        Game it = queueArray[front];
        queueArray[front] = null;
        front = (front + 1) % maxSize; // Circular increment
        return it;
    }

    @Override
    public Game frontValue() {
        if (length() == 0)
            return null;
        return queueArray[front];
    }

    @Override
    public int length() {
        return (rear - front + 1 + maxSize) % maxSize;
    }

    @Override
    public boolean isEmpty() {
        return (front - rear + maxSize) % maxSize == 1;
    }

    public String printQueue() {
        String result = "";
        int size = length();
        int index = front;

        for (int i = 0; i < size; i++) {
            result = result + (i+1) + " " + queueArray[index] + "\n";
            index = (index + 1) % maxSize;
        }

        return result;
    }

}