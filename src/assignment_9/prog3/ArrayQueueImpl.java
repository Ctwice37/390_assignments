package assignment_9.prog3;


import java.util.Arrays;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int size = 0;
    private int front = -1;
    private int rear = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(int val) {
        if (rear == arr.length)
            resize();
        if (isEmpty())
            front++;
        arr[rear] = val;
        size++;
    }

    public void dequeue() {
        if (isEmpty())
            return;
        front++;
        size--;

    }

    public int peek() {
        if(isEmpty())
            throw new IllegalStateException("Cannot peek because Queue is empty!");

        return arr[rear];
    }

    public void resize() {
        int newLen = arr.length * 2;
        Arrays.copyOf(arr, newLen);
    }

    public static void main(String[] args) {
        ArrayQueueImpl q = new ArrayQueueImpl();

        //uncomment when ready
        for (int i = 0; i < 15; i++)
            q.enqueue(i);
        for (int i = 0; i < 14; i++)
            q.dequeue();

        System.out.println("Size --> " + q.size());
        System.out.println("Top --> " + q.peek());

    }
}

