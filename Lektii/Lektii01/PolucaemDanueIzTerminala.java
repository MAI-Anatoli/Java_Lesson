package Lektii.Lektii01;

import java.util.Scanner;

public class PolucaemDanueIzTerminala {
    public static void main(String[] args) {
//****************************************************************/
//                      СТРОКИ
//****************************************************************/
//                    Name:

//        Scanner iScaner = new Scanner(System.in);
//        System.out.printf("Name: ");
//        String name = iScaner.nextLine();
//        System.out.printf("Hello, %s", name);
//        iScaner.close();

//*****************************************************************/
//                  НЕКОТОРЫЕ ПРИМИТИВЫ
//*****************************************************************/
//    Получаем данные разного типа и делаем операцию сложения

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner.nextInt();
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner.close();
//*******************************************************************/
//              ПРОВЕРКА НА СООТВЕТСТВИЕ ПОЛУЧАЕМОГО ТИПА
//**************************************************************************

//        Scanner iScanner = new Scanner(System.in);
//        System.out.print("int  a: ");
//        boolean flag = iScanner.hasNextInt();
//        System.out.println(flag);
//        int i = iScanner.nextInt();
//        System.out.println(i);
//        iScanner.close();
    }
}
