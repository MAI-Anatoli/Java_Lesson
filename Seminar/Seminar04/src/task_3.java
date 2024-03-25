import java.util.*;

/* Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная
была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти */
public class task_3 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        boolean work = true;
        while (work){
            System.out.println("Введите строку: ");
            String line = scanner.nextLine();

            switch (line){
                case "print":
//                    for (int i = list.size() -1; i >= 0; i--) {
//                        System.out.println(list.get(i));
//                    }
//                    ListIterator<String> iterator = list.listIterator(list.size());
//                    while (iterator.hasPrevious()){
//                        System.out.println(iterator.previous());
//                    }
                    for (String s : list) {
                        System.out.println(s);
                    }
                    break;
                case "revert":
                    list.remove(0);
                    break;
                case "finish":
                    work = false;
                    break;
                default:
                    list.add(0, line);
            }
        }
        System.out.println("До новых встреч");

    }



    }

