package LinkedList;

/**
 * @file Test.java
 * @date Feb 28, 2019 , 2:09:07 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Test {

    public static void main(String[] args) {
        LinkedList<Integer> liste = new LinkedList<>();

        System.out.println("size : " + liste.size());
        liste.print();

        liste.addLast(5);
        liste.addLast(4);
        liste.addFirst(8);

        liste.print();

        liste.insertAfter(3, 7);
        liste.insertAfter(2, 5);

        liste.print();
        System.out.println("size : " + liste.size());

        liste.remove(8);
        liste.remove(3);
        liste.print();
        System.out.println("size : " + liste.size());
    }
}
