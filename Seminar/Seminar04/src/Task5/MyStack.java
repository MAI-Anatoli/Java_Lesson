package Task5;

public class MyStack {
    private int[] arr = new int[10];
    private int size = 0;
    int size(){
        return size;
    }
    boolean empty(){
        return size == 0;
    }
    void push(int elem){
        arr[size++] = elem;
    }
    int peek(){
        return arr[size-1];
    }
    int pop(){
        return arr[--size];
    }

}
