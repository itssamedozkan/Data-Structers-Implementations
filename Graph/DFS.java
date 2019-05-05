package Graph;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @file DFS.java
 * @date May 2, 2019 , 1:41:07 PM
 * @author Ismail Taha Samed Ozkan
 */
public class DFS<T> {

    void dfsRecursive(Node<T> node) {
        System.out.print(node.data + " ");
        node.visited = true;

        LinkedList<Node<T>> neighbourList = node.getNeighbourList();

        for (Node<T> neighbour : neighbourList) {
            if (!neighbour.visited) {
                dfsRecursive(neighbour);
                //neighbour.visited = true;
            }
        }
    }

    void dfs(Node<T> startNode) {
        Stack<Node<T>> stack = new Stack();

        stack.push(startNode);
        startNode.visited = true;

        while (!stack.isEmpty()) {
            Node<T> pop = stack.pop();
            System.out.print(pop.data + " ");

            LinkedList<Node<T>> neighbourList = pop.getNeighbourList();

            for (Node<T> neighbour : neighbourList) {
                if (!neighbour.visited) {
                    stack.push(neighbour);
                    neighbour.visited = true;
                }
            }
        }
        System.out.println();
    }

    boolean path(Node<T> from, Node<T> to) {
        from.visited = true;

        if (from.equals(to)) {
            return true;
        }

        LinkedList<Node<T>> neighbours = from.getNeighbourList();

        for (Node neighbour : neighbours) {
            if (!neighbour.visited) {
                return path(neighbour, to);
            }
        }

        return false;
    }

    String printPath(Node<T> from, Node<T> to) {
        from.visited = true;

        if (from.equals(to)) {
            return to.data + " : path found";
        }

        LinkedList<Node<T>> neighbours = from.getNeighbourList();
        String result;

        for (Node neighbour : neighbours) {
            if (!neighbour.visited) {
                result = from.data + " -> " + printPath(neighbour, to);

                if (result.contains("found")) {
                    return result;
                }
            }
        }

        return "no path from vertex " + from.data + " to vertex " + to.data;
    }
}
