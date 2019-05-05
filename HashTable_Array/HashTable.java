package HashTable_Array;

/**
 * @file HashTable.java
 * @date Apr 11, 2019 , 1:15:39 PM
 * @author Ismail Taha Samed Ozkan
 */
public class HashTable<T, G> {

    // Linear Probing (Closed Addressing)
    private HashEntry<T, G>[] table;

    public HashTable(int M) {
        table = new HashEntry[M];
    }

    boolean put(T key, G value) {
        int index = hashFunction(key);

        if (table[index] == null) {
            table[index] = new HashEntry<>(key, value);
            return true;
        } else {
            // TODO: duplicate key control
            // Linear Probing, no duplicate key control
            int tempIndex = (index + 1) % table.length;

            while (tempIndex != index) {
                if (table[tempIndex] == null) {
                    table[tempIndex] = new HashEntry<>(key, value);
                    return true;
                }

                tempIndex = (tempIndex + 1) % table.length;
            }
        }
        return false;
    }

    G get(T key) {
        int index = hashFunction(key);

        if (table[index] != null && key.equals(table[index].key)) {
            return table[index].value;
        } else {
            // Linear Probing
            int tempIndex = (index + 1) % table.length;

            while (tempIndex != index && table[tempIndex] != null) {
                if (key.equals(table[tempIndex].key)) {
                    return table[tempIndex].value;
                }

                tempIndex = (tempIndex + 1) % table.length;
            }
        }
        return null;
    }

    protected int hashFunction(T key) {
        String str = String.valueOf(key);

        int parseInt = Integer.parseInt("" + str.charAt(str.length() - 1));

        return parseInt % table.length;
    }

    void print() {
        for (int i = table.length - 1; i >= 0; i--) {
            System.out.print("[" + i + "] ");

            if (table[i] == null) {
                System.out.println("null");
            } else {
                System.out.println("[" + table[i].key + " : " + table[i].value + "]");
            }
        }
    }
}
