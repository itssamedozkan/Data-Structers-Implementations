package Queue_LinkedList;

/**
 * @file Node.java
 * @date Mar 21, 2019 , 1:35:45 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Node<T> {

    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }

}
