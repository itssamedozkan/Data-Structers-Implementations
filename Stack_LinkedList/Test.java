package Stack_LinkedList;

/**
 * @file Test.java
 * @date Mar 14, 2019 , 2:21:31 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Test {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.print();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.print();

        System.out.println("size : " + stack.size());
        System.out.println("peek : " + stack.peek());

        stack.pop();

        stack.print();
        System.out.println("size : " + stack.size());

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("size : " + stack.size());
    }
}
