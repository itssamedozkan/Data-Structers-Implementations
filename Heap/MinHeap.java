package Heap;

/**
 * @file MinHeap.java
 * @date Apr 18, 2019 , 1:09:38 PM
 * @author Ismail Taha Samed Ozkan
 */
public class MinHeap<T extends Comparable<T>> {

    private T[] heap;
    private int size;

    public MinHeap(int capacity) {
        heap = (T[]) new Comparable[capacity];
        size = 0;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private void swap(int i, int j) {
        T temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    void insert(T data) {
        if (size < heap.length) {
            heap[size] = data;
            int current = size++;

            while (heap[current].compareTo(heap[parent(current)]) < 0) {
                swap(current, parent(current));
                current = parent(current);
            }
        } else {
            System.out.println("array is full !");
        }
    }

    void heapify() {
        int lastIndex = size - 1;

        for (int i = parent(lastIndex); i >= 0; i--) {
            minHeap(i);
        }
    }

    private void minHeap(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int min = i;

        if (left < size && heap[min].compareTo(heap[left]) > 0) {
            min = left;
        }
        if (right < size && heap[min].compareTo(heap[right]) > 0) {
            min = right;
        }

        if (min != i) {
            swap(min, i);
            minHeap(min);
        }
    }

    T deleteMin() {
        T deletedElement = heap[0];

        heap[0] = heap[size - 1];
        size--;
        heapify();

        return deletedElement;
    }

    void printArray() {
        for (T element : heap) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // prints parent nodes with their left child and right child
    void print() {
        for (int k = 0; k <= parent(size - 1); k++) {
            int level = (int) (Math.log(k + 1) / Math.log(2));
            System.out.print(level + ". Seviye ");

            System.out.print("  Parent : " + heap[k]);

            int left = 2 * k + 1;
            int right = 2 * k + 2;

            System.out.print("\t\tLeft Child: " + heap[left]);

            if (right < size) {
                System.out.print("\t\tRight Child :" + heap[right]);
            } else {
                System.out.print("\t\tRight Child : -");
            }

            System.out.println();
        }
    }

    // only for Integer MinHeap
    void decreaseKey(int key, int amount) {
        for (int i = 0; i < size; i++) {
            if (heap[i].equals(key)) {
                heap[i] = (T) new Integer(key - amount);

                while (heap[i].compareTo(heap[parent(i)]) < 0) {
                    swap(i, parent(i));
                    i = parent(i);
                }
                return;
            }
        }
    }

    // only for Integer MinHeap
    void increaseKey(int key, int amount) {
        for (int i = 0; i < size; i++) {
            if (heap[i].equals(key)) {
                heap[i] = (T) new Integer(key + amount);

                minHeap(i);
                return;
            }
        }
    }

    // 25.04.2019 - SortingAlgorithms
    void heapSort() {
        // run heapify method to ensure it is a min heap
        heapify();

        int lastIndex = size - 1;
        for (int i = lastIndex; i > 0; i--) {
            swap(0, i);
            size--;
            minHeap(0);
        }
    }
}
