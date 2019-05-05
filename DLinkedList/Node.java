package DLinkedList;

/**
 * @file Node.java
 * @date Mar 7, 2019 , 1:05:11 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T data) {
        this.data = data;
    }
}
