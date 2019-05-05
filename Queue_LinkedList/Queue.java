package Queue_LinkedList;

/**
 * @file Queue.java
 * @date Mar 21, 2019 , 1:36:51 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Queue<T> {

    private Node<T> front, rear;

    void enqueue(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    T dequeue() {
        if (isEmpty()) {
            System.out.println("empty queue !");
            return null;
        } else {
            T temp = front.data;

            front = front.next;

            if (isEmpty()) {
                rear = null;
            }

            return temp;
        }
    }

    boolean isEmpty() {
        return (front == null);
    }

    int size() {
        int size = 0;

        Node<T> temp = front;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    void print() {
        Node<T> temp = front;

        while (temp != null) {
            System.out.print(temp + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
