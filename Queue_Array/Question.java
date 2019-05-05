package Queue_Array;

/**
 * @file Question.java
 * @date Mar 21, 2019 , 2:48:03 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Question {

    public static void main(String[] args) {
        int k = 10;
        System.out.println("fibonacci(" + k + ") = " + fibonacci(k));
        // fibonacci(10) = 55

        fibonacciPrint1(k);
        // 0 1 1 2 3 5 8 13 21 34 55
        
        fibonacciPrint2(k);
    }

    public static int fibonacci(int n) {
        Queue<Integer> kuyruk = new Queue<>(2);

        kuyruk.enqueue(0);
        kuyruk.enqueue(1);

        // İsmail Taha Samed ÖZKAN: return n-th Fibonacci number
        for (int i = 0; i < n; i++) {
            int first = kuyruk.dequeue();
            int second = kuyruk.dequeue();
            kuyruk.enqueue(second);
            kuyruk.enqueue(first + second);
        }

        return kuyruk.dequeue();
    }

    public static void fibonacciPrint1(int n) {
        Queue<Integer> kuyruk = new Queue<>(2);

        kuyruk.enqueue(0);
        kuyruk.enqueue(1);

        // İsmail Taha Samed ÖZKAN: print Fibonacci numbers until n-th number
        for (int i = 0; i < n; i++) {
            int first = kuyruk.dequeue();
            int second = kuyruk.dequeue();
            kuyruk.enqueue(second);
            kuyruk.enqueue(first + second);
            System.out.print(first + "  ");
        }

        System.out.println(kuyruk.dequeue());
    }
    
    public static void fibonacciPrint2(int n) {
        Queue<Integer> kuyruk = new Queue<>(2);

        kuyruk.enqueue(0);
        kuyruk.enqueue(1);

        // İsmail Taha Samed ÖZKAN: print Fibonacci numbers until n-th number
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + "  ");
        }

        System.out.println(fibonacci(n));
    }
}
