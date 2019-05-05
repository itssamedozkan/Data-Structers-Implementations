package Graph;

import java.util.LinkedList;

/**
 * @file Node.java
 * @date May 2, 2019 , 1:05:19 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Node<T> {

    T data;
    boolean visited;
    private LinkedList<Node<T>> neighbourList;

    public Node(T data) {
        this.data = data;
        this.neighbourList = new LinkedList<>();
    }

    void addNeighbour(Node<T> node) {
        neighbourList.add(node);
    }

    LinkedList<Node<T>> getNeighbourList() {
        return neighbourList;
    }
}
