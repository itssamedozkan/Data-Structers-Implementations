package Queue_Array;

/**
 * @file Queue.java
 * @date Mar 21, 2019 , 2:15:44 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Queue<T> {

    private T[] dataArray;
    private int front, rear;
    private int size;

    public Queue(int capacity) {
        front = 0;
        rear = 0;
        dataArray = (T[]) new Object[capacity];
    }

    void enqueue(T data) {
        if (isFull()) {
            System.out.println("queue is full !");
        } else {
            dataArray[rear] = data;
            rear++;

            if (rear % dataArray.length == 0) {
                rear = 0;
            }

            size++;
        }
    }

    T dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty !");
            return null;
        } else {
            front++;
            T temp = dataArray[front - 1];

            if (front % dataArray.length == 0) {
                front = 0;
            }

            size--;
            return temp;
        }
    }

    boolean isFull() {
        return size == dataArray.length;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }

    void print() {
        int index = front;

        for (int i = 0; i < size; i++) {
            System.out.print(dataArray[index++] + " -> ");

            if (index % dataArray.length == 0) {
                index = 0;
            }
        }

        System.out.println("null");
    }
}
