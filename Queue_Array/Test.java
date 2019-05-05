package Queue_Array;

/**
 * @file Test.java
 * @date Mar 21, 2019 , 2:50:34 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Test {

    public static void main(String[] args) {
        Queue<Integer> kuyruk = new Queue<>(2);

        kuyruk.enqueue(1);
        kuyruk.enqueue(2);
        kuyruk.enqueue(3);

        System.out.println("size : " + kuyruk.size());
        kuyruk.print();

        kuyruk.dequeue();
        kuyruk.enqueue(kuyruk.dequeue());
        kuyruk.enqueue(kuyruk.dequeue());

        System.out.println("size : " + kuyruk.size());
        kuyruk.print();
    }
}
