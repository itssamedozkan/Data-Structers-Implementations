package Graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @file BFS.java
 * @date May 2, 2019 , 1:14:54 PM
 * @author Ismail Taha Samed Ozkan
 */
public class BFS<T> {

    void bfs(Node<T> startNode) {
        Queue<Node<T>> queue = new LinkedList();

        queue.add(startNode);
        startNode.visited = true;

        while (!queue.isEmpty()) {
            Node<T> remove = queue.remove();
            System.out.print(remove.data + " ");

            LinkedList<Node<T>> neighbourList = remove.getNeighbourList();

            for (Node<T> neighbour : neighbourList) {
                if (!neighbour.visited) {
                    queue.add(neighbour);
                    neighbour.visited = true;
                }
            }
        }
        System.out.println();
    }
}
