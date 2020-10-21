package app;

import app.БазовыеФункции.*;
import app.Наследование.Полиморфизм.interfacesHuman;
import app.Наследование.Полиморфизм.polymorphismDancer;
import app.Наследование.Полиморфизм.resetMethods;
import static app.БазовыеФункции.returnMethod.convertCelsiusToFahrenheit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class startClass {

    //public/static - модификаторам
    //void/int/etc - параметры (возвращает или нет значения функция)

    public static void main(String[] args) { //точка входа в программу. Чтобы вызвать какой-либо метод класса, необходимо его прописать в методе main
        //classCat.cats(); //запуск метода cats() класса Cat
        //massive.mas(); //Работа с массивами
        //enterVolume.communication(); //введение значений
        //hello(); //вызов метода внутри класса метода main()
        //resetMethods.universioinFunction(); //Перегрузка методов (полиморфизм)
        //Ключ и значение - ФИО и паспорт //hashMap.keyValue();
        //Вызов статик и не статик метода
        /*StaticNostatic c1 = new StaticNostatic(); //работает, даже в случае, если методы не статичны
        c1.firstMethod();
        c1.secondMethod();
        StaticNostatic.firstMethod();
        StaticNostatic.secondMethod(); //метод не статичен, поэтому ошибка*/
        //Интерфейсы
        /*interfaceSwim human = new interfacesHuman("Антон", 6);
        interfaceSwim fish = new interfacesHuman.Fish("кит");
        interfaceSwim boat = new interfacesHuman.UBoat(25);
        List<interfaceSwim> swimmers = Arrays.asList(human, fish, boat);
        for (interfaceSwim s : swimmers) {
            s.swim();
        }*/
        //Полиморфизм
        /*polymorphismDancer dancer = new polymorphismDancer("Антон", 18);
        polymorphismDancer breakDance = new polymorphismDancer.breakDance("Алексей", 19);// восходящее преобразование к базовому типу
        polymorphismDancer electricBoogieDancer = new polymorphismDancer.ElectricBoogieDancer("Игорь", 20); // восходящее преобразование к базовому типу
        List<polymorphismDancer> discotheque = Arrays.asList(dancer, breakDance, electricBoogieDancer);
        for (polymorphismDancer d : discotheque) {
            d.dance();// полиморфный вызов метода
        }*/
        //Функция return
        /*int a = 5, b = 7;
        int m = returnMethod.min(a, b);
        System.out.println("Minimum is "+ m);
        System.out.println(convertCelsiusToFahrenheit(41));//возвращает значение для метода double

        System.out.println(returnMethod.min1(1, 2, 3));
        System.out.println(returnMethod.min1(1, 3, 2));
        System.out.println(returnMethod.min1(2, 1, 3));
        System.out.println(returnMethod.min1(2, 3, 1));
        System.out.println(returnMethod.min1(3, 1, 2));
        System.out.println(returnMethod.min1(3, 2, 1)); //false
        System.out.println(returnMethod.min1(-1, -2, -3));
        System.out.println(returnMethod.min1(3, 5, 3));
        System.out.println(returnMethod.min1(5, 5, 10));
        System.out.println(returnMethod.min1(3, 3, 5));
        System.out.println(returnMethod.min1(6, 3, 3));*/

    }

    static void hello() {

        System.out.println("Hello");
    }
}
