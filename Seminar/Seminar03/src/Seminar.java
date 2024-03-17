import java.util.ArrayList;
import java.util.List;

/* Данны следуюшие строки, сравнить их с помощью == и метода equals() класса Object
* String s1 = "hello";
* String s2 = "hello";
* String s3 = s1;
* String s4 = "h" + "e" + "l" + "l" + "o";
* String s5 = new String("hello");
* String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
*/
public class Seminar {
    public static void main(String[] args) {
String s1 = "hello";
String s2 = "hello";
String s3 = s1;
String s4 = "h" + "e" + "l" + "l" + "o";
String s5 = new String("hello");
String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);

/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
//          public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//    int num = 5;
//    String s = "Привет";
//
//    test(list, num, s);
//
//        System.out.println(list);
//        System.out.println(num);
//        System.out.println(s);
//    }
//    static void test(List<Integer> list, int num, String s){
//        list.add(10);
//        num++;
//        s = "Пока";

    }
}


