package app.БазовыеФункции;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class enterVolume {

    public static void communication() {
        int a, b, c;
        //String s1, s2;
        System.out.println("Введите два числа");
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        c = a + b;
        System.out.println("Сумма ваших чисел равна " + c);

        //Метод, которые чаще используется
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine(); //Ввести с клавиатуры строку
        int nAge = Integer.parseInt(sAge); //Ввести с клавиатуры число*/
    }
}
