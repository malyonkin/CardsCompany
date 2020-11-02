package app.БазовыеФункции;

import java.util.ArrayList;
import java.util.List;

public class massive {
    /*List<String> animals = new ArrayList();
        animals.add("cat");
        animals.add("dog"); //1
        animals.add("frog");
        int length =animals.size();
        //System.out.println(length);
        for (int i=0;i<length;i++) {
            String animal = animals.get(i);
            System.out.println(animal);
        }*/

    /*public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        String number1 = Integer.toString(number);
        String[] a = number1.split("");
        //System.out.println(a.length);
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum=sum+Integer.parseInt(a[i]);
        }
        return sum;
    }*/

    public static void mas() { //static - делает переменную или метод "независимыми" от объекта. Метод вызывается без создания объекта класса.
        List<Integer> bablo = new ArrayList();
        bablo.add(800);
        bablo.add(1500);
        bablo.add(2200);
        bablo.add(2700);
        bablo.add(3200);
        List<String> month = new ArrayList();
        month.add(" первый");
        month.add("o второй");
        month.add(" третий");
        month.add(" четвертый");
        month.add(" пятый");

        System.out.println("Меня зовут Амиго.\n");

        for (int i = 0; i < 5; i++) {
            System.out.println("Я согласен на зарплату $" + bablo.get(i) + "/месяц в" + month.get(i) + " год.");
        }
        System.out.println("\nПоцелуй мой блестящий металлический зад!");
    }
}
