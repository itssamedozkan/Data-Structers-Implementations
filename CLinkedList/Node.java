package CLinkedList;

/**
 * @file Node.java
 * @date Mar 7, 2019 , 2:06:01 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}
