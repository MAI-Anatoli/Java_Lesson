import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/* 1) Написать метод, который принимает массив элементов, помещает их в стэк
и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в
очередь и выводит на консоль содержимое очереди.  */
public class task_4 {
    public static void main(String[] args) {
        Integer[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayAsStack(arr);
        arrayAsQueue(arr);
    }
static void arrayAsQueue(Integer[] arr){
    Queue<Integer> queue =new LinkedList<>();
    queue.addAll(Arrays.asList(arr));
    while (!queue.isEmpty()){
        System.out.println(queue.poll());
    }
}
    static void arrayAsStack(Integer[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));

        //System.out.println(stack);
//for (int a : stack){
//    System.out.println(a);
//    }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
}
}
