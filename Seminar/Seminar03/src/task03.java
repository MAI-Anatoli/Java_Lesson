import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.*/
public class task03 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(10);
        list.add("15");
        list.add(31);
        list.add(3.14);
        list.add(null);
        list.add(true);
        list.add(11);
        list.add(15);
        list.add("Привет");

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) instanceof Integer){
//                list.remove(i--);
//            }
//
//        }
        list.removeIf(o -> o instanceof Integer);
        System.out.println(list);
    }
}
