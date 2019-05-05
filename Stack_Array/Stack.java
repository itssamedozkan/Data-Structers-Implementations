package Stack_Array;

/**
 * @file Stack.java
 * @date Mar 14, 2019 , 1:16:43 PM
 * @author Ismail Taha Samed Ozkan
 */
public class Stack<T> {
    private T dataArray[];
    private int top;

    public Stack(int capacity) {
        dataArray = (T[]) new Object[capacity];
        top = -1;
    }
    
    void push(T data){
        if(isFull()){
            System.out.println("full stack !");
        }
        else{
            dataArray[++top] = data;
        }
    }
    
    T pop(){
        if(isEmpty()){
            System.out.println("empty stack !");
            return null;
        }
        else{
            return dataArray[top--];
        }
    }
    
    T peek(){
        if(isEmpty()){
            return null;
        }
        else{
            return dataArray[top];
        }
    }

    private boolean isFull() {
        return top + 1 == dataArray.length;
    }

    private boolean isEmpty() {
        return top == -1;
    }
    
    int size(){
        return top + 1;
    }
    
    void print(){
        if(isEmpty()){
            System.out.println("empty stack !");
        }
        else{
            for (int i = top; i >= 0; i--) {
                System.out.println(dataArray[i]);
            }
        }
    }
    
}
