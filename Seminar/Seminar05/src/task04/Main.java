package task04;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* Взять набор строк, например,

Мороз и солнце день чудесный
Еще ты дремлешь друг прелестный
Пора красавица проснись.

Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с
одинаковой длиной не должны “потеряться”. */
public class Main {
    public static void main(String[] args) {

       String s = "Мороз и солнце день чудесный \n" +
               "Еще ты дремлешь друг прелестный\n" +
               "Пора красавица проснись.";
       sortByLength(s);

    }

    static void sortByLength(String s){
        Map<Integer, List<String>> treemap = new TreeMap<>();
        s = s.replace("\n", " ");
        s = s.replace(".", "");
        String[] arr = s.split(" ");

        for (String word: arr){
            int len = word.length();
            if (treemap.containsKey(len)){
                List<String> list = treemap.get(len);
                list.add(word);

            }else {
               List<String> list = new ArrayList<>();
               list.add(word);
               treemap.put(len, list);

            }

        }

        System.out.println(treemap);
    }
}
