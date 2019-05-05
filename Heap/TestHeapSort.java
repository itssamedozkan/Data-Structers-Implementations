package Heap;

/**
 * @file TestHeapSort.java
 * @date Apr 25, 2019 , 1:53:43 PM
 * @author Ismail Taha Samed Ozkan
 */
public class TestHeapSort {

    public static void main(String[] args) {
        MinHeap<Integer> minHeap = new MinHeap(18);

        minHeap.insert(8);
        minHeap.insert(15);
        minHeap.insert(21);
        minHeap.insert(46);
        minHeap.insert(37);
        minHeap.insert(27);
        minHeap.insert(23);
        minHeap.insert(92);
        minHeap.insert(93);
        minHeap.insert(45);
        minHeap.insert(116);
        minHeap.insert(42);
        minHeap.insert(87);
        minHeap.insert(34);
        minHeap.insert(66);
        minHeap.insert(111);
        minHeap.insert(98);
        minHeap.insert(95);

        minHeap.print();

        System.out.println("\nbefore heap sort : ");
        minHeap.printArray();
        
        minHeap.heapSort();
        System.out.println("\nafter heap sort : ");
        minHeap.printArray();
    }
}
