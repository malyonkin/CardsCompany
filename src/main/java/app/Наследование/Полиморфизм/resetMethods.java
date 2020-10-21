package app.Наследование.Полиморфизм;

import app.БазовыеФункции.classCat;

import java.util.Scanner;

public class resetMethods {


    //перегрузка методов
    public static short sum(short x, short y) {
        return (short) (x + y);
    }
    public static int sum(int x, int y, int z) { return x + y + z; }
    public static float sum(float x, float y) {
        return x + y;
    }
    public static double sum(double x, double y) { return x + y; }
    public static String sum(String x) { return x ="Теперь я не числа, а символы, а лучше даже слова"; }

    //@Override
    public static void universioinFunction() {
        //resetMethods enterUp = new resetMethods();
        System.out.println(resetMethods.sum(2, 3));
        System.out.println(resetMethods.sum(4, 3, 5));
        System.out.println(resetMethods.sum(4.322, 3));
        System.out.println(resetMethods.sum("парам"));

        System.out.println("Введите что-нибудь");
        sum(String.valueOf(new Scanner(System.in).nextInt()));
    }
}
