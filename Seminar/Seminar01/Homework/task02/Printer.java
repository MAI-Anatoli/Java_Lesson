package Seminar.Seminar01.Homework.task02;
/* Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.

Напишите свой код в методе printPrimeNums класса Answer.

Пример

2
3
5
7
11
...*/
class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
int max = 1000;
for (int i = 2; i< max; i++){
    boolean check = true;
    for (int j = i-1; j > 1; j--){
        if (i % j == 0){
            check = false;
            break;
        }
    }
    if ( check){
        System.out.println(i);
    }
}




    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {

      Answer ans = new Answer();
      ans.printPrimeNums();
    }
}


//***************************************************************************/
//  Решение с автотеста


//        // Проход начинается с 2, т.к. это число является наименьшим простым
//        for (int i = 2; i <= 1000; i++) {
//
//            boolean isPrime = true;
//
//            // Проверка, является ли число i простым
//            // Проход по циклу до корня числа,
//            // т.к. дальше нет смысла искать, делителей нет.
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            // Если число i простое, вывод его на экран
//            if (isPrime)
//                System.out.println(i);
//        }
//    }
//}