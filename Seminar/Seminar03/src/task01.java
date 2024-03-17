import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на
экран.*/
public class task01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        genList(list, 10, 0, 10);
        System.out.println(list);

        list.sort(null);
        System.out.println(list);
    }
    static void genList(List<Integer> list, int capacity, int min, int max){
        Random random =new Random();
        for (int i = 0; i < capacity; i++){
            list.add(random.nextInt(min, max+1));
        }
    }
}
