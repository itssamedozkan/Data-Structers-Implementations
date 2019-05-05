package HashTable_Array;

/**
 * @file Test.java
 * @date Apr 11, 2019 , 1:47:42 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Test {

    public static void main(String[] args) {
        HashTable<Integer, String> table = new HashTable<>(5);

        System.out.println(table.put(12345, "Stu1"));
        System.out.println(table.put(345, "Stu2"));
        System.out.println(table.put(123, "Stu3"));
        System.out.println(table.put(134, "Stu4"));
        System.out.println(table.put(130, "Stu5"));
        System.out.println(table.put(42, "Stu6"));

        System.out.println("get(134) : " + table.get(134));
        System.out.println("get(130) : " + table.get(130));
        System.out.println("get(333) : " + table.get(333));

        System.out.println("Hash Table :");
        table.print();

    }
}
