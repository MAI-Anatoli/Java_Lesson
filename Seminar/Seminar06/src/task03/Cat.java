package task03;
/* 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java. */
/* 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
использовать не все придуманные поля и методы. Создайте несколько
экземпляров этого класса, выведите их в консоль.
2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
его кличка, цвет и возраст (или другие параметры на ваше усмотрение). */

import java.util.List;
import java.util.Objects;

public class Cat {
    int age;
    String name;
    String owner;
    boolean sterilization;
    String color;

    @Override
//    public String toString() {
//        return "name: " + name + "\nowner: " + owner + "\nage: " + age +"\ncolor: " + color + "\nsterilization: " + sterilization +" \n ";
//    }
     public String toString() {
        return "name: " + name + ", owner: " + owner + ", age: " + age +", color: " + color + ", sterilization: " + sterilization;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Cat cat){
    //        Cat cat = (Cat) obj;
            return age == cat.age && name.equals(cat.name) && owner.equals(cat.owner) &&
                    sterilization == cat.sterilization && color.equals(cat.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return age + 7*name.hashCode() + 11*owner.hashCode() + 13*Objects.hashCode(sterilization) + 17*color.hashCode();
    }
}

