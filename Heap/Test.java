package Heap;

/**
 * @file Test.java
 * @date Apr 18, 2019 , 2:04:24 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Test {

    public static void main(String[] args) {
        MinHeap<Integer> minHeap = new MinHeap(10);

        minHeap.insert(48);
        minHeap.insert(16);
        minHeap.insert(24);
        minHeap.insert(20);
        minHeap.insert(8);
        minHeap.insert(12);
        minHeap.insert(32);
        minHeap.insert(54);
        minHeap.insert(72);
        minHeap.insert(4);

        minHeap.printArray();
        System.out.println();

        minHeap.print();
        System.out.println("Minimum : " + minHeap.deleteMin() + "\n");

        // decrease key
        System.out.println("after decrease key method :");
        minHeap.decreaseKey(72, 70);
        minHeap.printArray();
        System.out.println();

        minHeap.print();
        System.out.println("Minimum : " + minHeap.deleteMin());
    }
}
