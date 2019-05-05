package HashTable_LinkedList;

/**
 * @file HashTable.java
 * @date Apr 11, 2019 , 2:16:36 PM
 * @author Ismail Taha Samed Ozkan
 */
public class HashTable<T, G> {

    // Separate Chaining (Open Addressing)
    private LinkedList<T, G>[] table;

    public HashTable(int M) {
        table = new LinkedList[M];

        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<>();
        }
    }

    void put(T key, G value) {
        int index = hashFunction(key);

        Node<T, G> temp = table[index].head;

        // duplicate key control
        while (temp != null && !key.equals(temp.key)) {
            temp = temp.next;
        }

        if (temp == null) {   // new key
            table[index].addFirst(key, value);
        } else {   // duplicate key
            System.out.println("duplicate key !!");
        }
    }

    G get(T key) {
        int index = hashFunction(key);

        Node<T, G> temp = table[index].head;

        while (temp != null && !key.equals(temp.key)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("key \"" + key + "\" not found !");
            return null;
        } else {
            return temp.value;
        }
    }

    protected int hashFunction(T key) {
        String str = String.valueOf(key);

        int parseInt = Integer.parseInt("" + str.charAt(str.length() - 1));

        return parseInt % table.length;
    }

    void print() {
        for (int i = table.length - 1; i >= 0; i--) {
            System.out.print("[" + i + "] ");
            table[i].print();
        }
    }
}
