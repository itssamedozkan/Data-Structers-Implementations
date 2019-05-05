package HashTable_LinkedList;

/**
 * @file Test.java
 * @date Apr 11, 2019 , 2:33:08 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Test {

    public static void main(String[] args) {
        HashTable<Integer, String> table = new HashTable<>(4);

        table.put(12345, "Student 1");
        table.put(345, "Student 2");
        table.put(123, "Student 3");
        table.put(134, "Student 4");
        table.put(130, "Student 5");
        table.put(42, "Student 6");

        System.out.println("get(134) : " + table.get(134));
        System.out.println("get(130) : " + table.get(130));
        System.out.println("get(12345) : " + table.get(12345));
        System.out.println("get(333) : " + table.get(333));

        System.out.println("Hash Table :");
        table.print();
    }
}
