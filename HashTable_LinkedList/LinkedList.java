package HashTable_LinkedList;

/**
 * @file LinkedList.java
 * @date Apr 11, 2019 , 2:03:17 PM
 * @author Ismail Taha Samed Ozkan
 */
public class LinkedList<T, G> {

    protected Node<T, G> head;

    void addFirst(T key, G value) {
        Node<T, G> newNode = new Node(key, value);

        newNode.next = head;
        head = newNode;
    }

    void print() {
        Node<T, G> temp = head;

        while (temp != null) {
            System.out.print("[" + temp.key + " : " + temp.value + "] -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
