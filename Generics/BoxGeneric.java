package Generics;

/**
 * @file BoxGeneric.java
 * @date Feb 14, 2019 , 11:47:49 AM
 * @author Ismail Taha Samed Ozkan
 */
public class BoxGeneric<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        BoxGeneric<Integer> integerBox = new BoxGeneric<>();
        //BoxGeneric<String> stringBox = new BoxGeneric<String>();

        integerBox.add(10);
        //stringBox.add(new String("Hello World"));

        Integer someInteger = integerBox.get();
        System.out.println(someInteger);
    }
}
