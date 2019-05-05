package Sorting;

/**
 * @file Sorting.java
 * @date Apr 25, 2019 , 1:05:03 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Sorting {

    public static void main(String[] args) {
        int[] array = {2, 9, 5, 4, 8, 1, 6, 15, 16, 17};

        System.out.println("before Bubble Sort : ");
        printArray(array);

        System.out.println("\nBubble Sort : ");
        bubbleSort(array);

        System.out.println("\nafter Bubble Sort : ");
        printArray(array);
    }

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }

    }

    static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int key = array[i];

            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }

    static void bubbleSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            boolean isSwapped = false;

            for (int j = 0; j < array.length - i; j++) {

                if (array[j] > array[j + 1]) {
                    isSwapped = true;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            System.out.print(i + ". pass : ");
            printArray(array);

            if (!isSwapped) {
                System.out.println(array.length + " numbers sorted in " + i + " passes");
                break;
            }
        }
    }
}
