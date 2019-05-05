package BinarySearchTree;

/**
 * @file BinarySearchTree.java
 * @date Apr 4, 2019 , 1:11:52 PM
 * @author Ismail Taha Samed Ozkan
 */
public class BinarySearchTree<T extends Comparable<T>> {

    private Node<T> root;

    void insertRecursive(T newData) {
        root = insertRecursive(root, newData);
    }

    // recursive insert method
    private Node<T> insertRecursive(Node<T> node, T newData) {
        if (node == null) {
            return new Node<>(newData);
        } else {
            if (newData.compareTo(node.data) > 0) {
                node.right = insertRecursive(node.right, newData);
            } else if (newData.compareTo(node.data) < 0) {
                node.left = insertRecursive(node.left, newData);
            }

            return node;
        }
    }

    // iterative insert method
    void insert(T newData) {
        Node<T> newNode = new Node<>(newData);

        if (root == null) {
            root = newNode;
        } else {
            Node<T> temp = root;

            while (temp != null) {
                if (newData.compareTo(temp.data) > 0) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        return;
                    }

                    temp = temp.right;
                } else if (newData.compareTo(temp.data) < 0) {
                    if (temp.left == null) {
                        temp.left = newNode;
                        return;
                    }

                    temp = temp.left;
                } else {
                    return;
                }
            }

        }
    }

    // iterative search method
    boolean search(T searchData) {
        if (root == null) {
            System.out.println("empty tree !!");
        } else {
            Node<T> temp = root;

            while (temp != null) {
                if (searchData.compareTo(temp.data) > 0) {
                    temp = temp.right;
                } else if (searchData.compareTo(temp.data) < 0) {
                    temp = temp.left;
                } else {
                    return true;
                }
            }

        }
        return false;
    }

    void preorder() {
        System.out.print("preorder : ");
        preorder(root);
        System.out.println();
    }

    private void preorder(Node<T> node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    void inorder() {
        System.out.print("inorder : ");
        inorder(root);
        System.out.println();
    }

    private void inorder(Node<T> node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    void postorder() {
        System.out.print("postorder : ");
        postorder(root);
        System.out.println();
    }

    private void postorder(Node<T> node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    int sumRecursive() {
        return sumRecursive(root);
    }

    // recursive sum method
    private int sumRecursive(Node<T> node) {
        if (node != null) {
            if (node.data instanceof Number) {
                return ((Number) node.data).intValue() + sumRecursive(node.left) + sumRecursive(node.right);
            }
        }

        return 0;
    }

    int sizeRecursive() {
        return sizeRecursive(root);
    }

    // recursive size method
    private int sizeRecursive(Node<T> node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + sizeRecursive(node.left) + sizeRecursive(node.right);
        }
    }

    int fullNodeCountRecursive() {
        return fullNodeCountRecursive(root);
    }

    // recursive full node (node that have both left and right child) count method
    private int fullNodeCountRecursive(Node<T> node) {
        if (node == null) {
            return 0;
        } else {
            if (node.left != null && node.right != null) {
                return 1 + fullNodeCountRecursive(node.left) + fullNodeCountRecursive(node.right);
            } else {
                return 0 + fullNodeCountRecursive(node.left) + fullNodeCountRecursive(node.right);
            }
        }
    }
}
