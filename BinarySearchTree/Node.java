package BinarySearchTree;

/**
 * @file Node.java
 * @date Apr 4, 2019 , 1:07:19 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Node<T extends Comparable<T>> {

    T data;
    Node<T> left;
    Node<T> right;

    public Node(T data) {
        this.data = data;
    }

}
