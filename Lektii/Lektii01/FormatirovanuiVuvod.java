package Lektii.Lektii01;

public class FormatirovanuiVuvod {
    public static void main(String[] args) {
//********************************************************************/
//                   ФОРМАТИРОВАННЫЙ ВЫВОД
//********************************************************************/

//        int a = 1, b = 2;
//        int c = a + b;
//        String res = a + " + " + b + " = " + c;
//        System.out.println(res);

//*********************************************************************/


        int a = 1, b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d \n", a, b, c);
        System.out.printf("%d + %d = %d \n", a, b, c);
        System.out.println(res);

    }
}
