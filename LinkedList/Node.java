package LinkedList;

/**
 * @file Node.java
 * @date Feb 28, 2019 , 1:07:06 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Node<T> {

    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

}
