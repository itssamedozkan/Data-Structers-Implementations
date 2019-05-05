package Graph;

/**
 * @file TestDFS.java
 * @date May 2, 2019 , 2:07:25 PM
 * @author Ismail Taha Samed Ozkan
 */
public class TestDFS {

    public static void main(String[] args) {
        Node<Integer> n10 = new Node<>(10);
        Node<Integer> n20 = new Node<>(20);
        Node<Integer> n30 = new Node<>(30);
        Node<Integer> n40 = new Node<>(40);
        Node<Integer> n50 = new Node<>(50);
        Node<Integer> n60 = new Node<>(60);
        Node<Integer> n70 = new Node<>(70);

        n10.addNeighbour(n30);

        n20.addNeighbour(n10);
        n20.addNeighbour(n30);
        n20.addNeighbour(n50);
        n20.addNeighbour(n60);

        n30.addNeighbour(n60);

        n40.addNeighbour(n10);
        n40.addNeighbour(n20);

        n50.addNeighbour(n70);

        n60.addNeighbour(n70);

        DFS dfs = new DFS();
        dfs.dfs(n40);

        n10.visited = false;
        n20.visited = false;
        n30.visited = false;
        n40.visited = false;
        n50.visited = false;
        n60.visited = false;
        n70.visited = false;

        //dfs.dfsRecursive(n40);
        System.out.println();

        String path = dfs.printPath(n70, n60);
        System.out.println(path);

    }
}
