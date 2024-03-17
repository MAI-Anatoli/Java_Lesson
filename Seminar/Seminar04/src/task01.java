import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
Сравните с предыдущим.*/
public class task01 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long t1 = test1(list1);
        long t2 = test1(list2);

        System.out.println(t1);
        System.out.println(t2);
    }
    static long test1(List<Integer> list){
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long timeFinish = System.currentTimeMillis();
        return timeFinish - timeStart;

    }
}
