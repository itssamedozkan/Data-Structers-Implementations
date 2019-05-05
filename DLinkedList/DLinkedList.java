package DLinkedList;

/**
 * @file DLinkedList.java
 * @date Mar 7, 2019 , 1:07:13 PM
 * @author Ismail Taha Samed Ozkan
 */
public class DLinkedList<T> {

    private Node<T> head;
    private int size = 0;

    void addFirst(Node newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    void addFirst(T data) {
        addFirst(new Node<>(data));
    }
    
    void addLast(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            //head = newNode;
            addFirst(newNode);
        } else {
            Node<T> temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.prev = temp;
            
            size++;
        }
    }

    void insertAfter(T data, T search) {
        Node<T> temp = head;

        while (temp != null && temp.data != search) {
            temp = temp.next;
        }

        if (temp != null) {
            Node<T> newNode = new Node<>(data);

            newNode.next = temp.next;
            newNode.prev = temp;

            temp.next.prev = newNode;
            temp.next = newNode;
            
            size++;
        } else {
            System.out.println(search + " not found !");
        }
    }

    boolean remove(T data) {
        if (isEmpty()) {
            System.out.println("empty list !");
        } else {
            if (head.data.equals(data)) {
                head = head.next;
                head.prev = null;
                
                size--;
                return true;
            } else {
                Node<T> temp = head.next;

                while (temp != null && !temp.data.equals(data)) {
                    temp = temp.next;
                }

                if (temp != null) {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    
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
        
        System.out.println("null");
    }

    int size() {
        return size;
    }
}
