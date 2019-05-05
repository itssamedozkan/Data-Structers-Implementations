package BinarySearchTree;

/**
 * @file TestString.java
 * @date Apr 4, 2019 , 2:01:13 PM
 * @author Ismail Taha Samed Ozkan
 */
public class TestString {

    /*
                  FSM
                /     \
              Ali    Veli
               \       /
               Elma  Kalem
     */
    public static void main(String[] args) {
        BinarySearchTree<String> tree = new BinarySearchTree<>();

        tree.insert("FSM");

        tree.insert("Ali");
        tree.insert("Veli");

        tree.insert("Elma");
        tree.insert("Kalem");

        System.out.println("search for \"FSM\" : " + tree.search("FSM"));
        System.out.println("search for \"Fatih\" : " + tree.search("Fatih"));

        System.out.println("size : " + tree.sizeRecursive());
        System.out.println("full nodes : " + tree.fullNodeCountRecursive());

        // should return zero, finds sum for only numbers
        System.out.println("sum : " + tree.sumRecursive());
    }
}
