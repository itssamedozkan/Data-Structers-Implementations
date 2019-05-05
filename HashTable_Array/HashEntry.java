package HashTable_Array;

/**
 * @file HashEntry.java
 * @date Apr 11, 2019 , 1:14:28 PM
 * @author Ismail Taha Samed Ozkan
 */
public class HashEntry<T, G> {

    T key;
    G value;

    public HashEntry(T key, G value) {
        this.key = key;
        this.value = value;
    }

}
