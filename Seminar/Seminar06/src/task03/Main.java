package task03;
/* 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java. */

/*#############################################################################################*/

/* 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
использовать не все придуманные поля и методы. Создайте несколько
экземпляров этого класса, выведите их в консоль.
2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
его кличка, цвет и возраст (или другие параметры на ваше усмотрение). */

/*##############################################################################################*/

/* 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
Убедитесь, что все они сохранились во множество.
3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
4. Создайте метод public int hashCode()
который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
Objects.hash(...))
5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились. */

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Marchiza";
        cat1.age = 10;
        cat1.owner = "Marian Anatoli";
        cat1.color = "Black";
        cat1.sterilization = true;


        Cat cat2 = new Cat();
        cat2.name = "Vasia";
        cat2.age = 2;
        cat2.owner = "Struna Anatoli";
        cat2.color = "Silver";
        cat2.sterilization = false;


        Cat cat3 = new Cat();
        cat3.name = "Giorgi";
        cat3.age = 10;
        cat3.owner = "Marian Parascovia";
        cat3.color = "White";
        cat3.sterilization = true;


        Cat cat4 = new Cat();
        cat4.name = "Murca";
        cat4.age = 5;
        cat4.owner = "Vasilica Mihai";
        cat4.color = "Tricolor";
        cat4.sterilization = false;


        Cat cat5 = new Cat();
        cat5.name = "Murca";
        cat5.age = 5;
        cat5.owner = "Vasilica Mihai";
        cat5.color = "Tricolor";
        cat5.sterilization = false;

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        printSet(cats);

        printSet(findByColor("Black", cats));
    }

    static Set<Cat> findByColor(String color, Set<Cat> cats){
        Set<Cat> res = new HashSet<>();
        for (Cat cat: cats){
            if (cat.color.equals(color)){
                res.add(cat);
            }
        }
        return res;
    }

    static void printSet(Set<Cat> cats){
        for (Cat cat: cats){
            System.out.println(cat);
        }
    }
}
