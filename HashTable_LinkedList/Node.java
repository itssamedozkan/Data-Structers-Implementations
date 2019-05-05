package HashTable_LinkedList;

/**
 * @file Node.java
 * @date Apr 11, 2019 , 2:13:23 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Node<K, V> {

    K key;
    V value;
    Node<K, V> next;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }

}
