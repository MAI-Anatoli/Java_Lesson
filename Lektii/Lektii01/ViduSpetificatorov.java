package Lektii.Lektii01;

public class ViduSpetificatorov {
    public static void main(String[] args) {
//***************************************************************************/
//  %d: целочисленных значений
//  %x: для вывода шестнадцатеричных чисел
//  %f: для вывода чисел с плавающей точкой
//  %e: для вывода чисел в экспоненциальной форме, НАПРИМЕР: 3.1415+01
//  %c: для вывода одиночного символа
//  %s: для вывода строковых значений
//****************************************************************************/


        float pi = 3.1415f;
        System.out.printf("%f\n.", pi);
        System.out.printf("%.2f\n.", pi);
        System.out.printf("%.3f\n.", pi);
        System.out.printf("%e\n.", pi);
        System.out.printf("%.2e\n.", pi);
        System.out.printf("%.3e\n.", pi);

    }
}
