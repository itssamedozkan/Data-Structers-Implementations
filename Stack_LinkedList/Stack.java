package Stack_LinkedList;

/**
 * @file Stack.java
 * @date Mar 14, 2019 , 1:48:49 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Stack<T> {

    private Node<T> head;

    void push(T data) {
        Node<T> newNode = new Node<>(data);

        newNode.next = head;
        head = newNode;
    }

    T pop() {
        if (isEmpty()) {
            System.out.println("empty stack !");
            return null;
        } else {
            T temp = head.data;

            head = head.next;

            return temp;
        }
    }

    T peek() {
        if (isEmpty()) {
            System.out.println("empty stack !");
            return null;
        } else {
            return head.data;
        }
    }

    boolean isEmpty() {
        return head == null;
    }

    int size() {
        Node<T> temp = head;
        int counter = 0;

        while (temp != null) {
            counter++;
            temp = temp.next;
        }

        return counter;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("empty stack !");
        } else {
            Node<T> temp = head;

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
