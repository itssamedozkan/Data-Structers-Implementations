package Stack_LinkedList;

/**
 * @file Questions.java
 * @date Mar 14, 2019 , 2:27:11 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Questions {

    public static void main(String[] args) {
        decimalToBinary(21);
        decimalToBinary(7);

        System.out.println("ara : " + isPalindrome("ara"));
        System.out.println("veri : " + isPalindrome("veri"));
    }

    public static boolean isPalindrome(String text) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        for (int i = 0; i < text.length(); i++) {
            if (stack.pop() != text.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void decimalToBinary(int number) {
        Stack<Integer> stack = new Stack<>();

        while (number > 0) {
            stack.push(number % 2);
            number = number / 2;
        }

        while (!stack.isEmpty()) {
            Integer pop = stack.pop();
            System.out.print(pop);
        }
        System.out.println();
    }
}
