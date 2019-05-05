package BinarySearchTree;

/**
 * @file TestInteger.java
 * @date Apr 4, 2019 , 1:59:37 PM
 * @author @author Ismail Taha Samed Ozkan
 */
public class TestInteger {

    /*
                 15
                /  \
               6    18
              / \    \
             3   7    30
            / \   \  
           2   4   13 
     */
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        tree.insertRecursive(15);

        tree.insertRecursive(18);
        tree.insertRecursive(6);

        tree.insertRecursive(7);
        tree.insertRecursive(30);
        tree.insertRecursive(3);

        tree.insertRecursive(2);
        tree.insertRecursive(4);
        tree.insertRecursive(13);

        tree.preorder();
        tree.inorder();
        tree.postorder();

        System.out.println("search for 30 : " + tree.search(30));

        System.out.println("sum : " + tree.sumRecursive());
        System.out.println("size : " + tree.sizeRecursive());
        System.out.println("full nodes : " + tree.fullNodeCountRecursive());
    }
}
