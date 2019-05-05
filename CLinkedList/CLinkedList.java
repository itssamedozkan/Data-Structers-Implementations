package CLinkedList;

/**
 * @file CLinkedList.java
 * @date Mar 7, 2019 , 2:07:45 PM
 * @author Ismail Taha Samed Ozkan
 */
public class CLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    void addFirst(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        tail.next = head;
        size++;
    }

    void addLast(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;
        tail.next = head;

        size++;
    }

    // TODO: sonsuz döngü hatasını düzelt !! (fix infinite loop error)
    void insertAfter(T data, T search) {
        Node<T> temp = head;

        while (temp != null && temp.data != search) {
            temp = temp.next;

            // breaks loop when temp returns again head
            if (temp == head)
                break;
        }

        if (temp != null && temp.data == search) {
            Node<T> newNode = new Node<>(data);
            newNode.next = temp.next;
            temp.next = newNode;

            if (temp == tail) {
                tail = newNode;
            }
            size++;
        } else {
            System.out.println(search + " not found !");
        }
    }

    boolean remove(T data) {
        if (isEmpty()) {
            System.out.println("empty list !");
        } else {
            if (head.data.equals(data) && size == 1) {
                head = null;
                tail = null;

                size--;
                return true;
            } else if (head.data.equals(data)) {
                head = head.next;
                tail.next = head;

                size--;
                return true;
            } else {
                Node<T> temp = head.next;
                Node<T> prev = head;

                while (temp != head && !temp.data.equals(data)) {
                    prev = temp;
                    temp = temp.next;
                }

                if (temp != head) {
                    prev.next = temp.next;
                    if (temp == tail) {
                        tail = prev;
                    }

                    size--;
                    return true;
                } else {
                    System.out.println(data + " not found !");
                }
            }
        }
        return false;
    }

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        Node<T> temp = head;

        for (int i = 0; i < size; i++) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println(isEmpty() ? "empty list !" : head.data);
    }

    int size() {
        return size;
    }
}
