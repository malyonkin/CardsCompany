package app.БазовыеФункции;

public class returnMethod {
    public static double convertCelsiusToFahrenheit(int celsius) {
        //напишите тут ваш код
        double fahrenheit = (9.0/5.0) * celsius + 32;
        //System.out.println(fahrenheit);

        return fahrenheit;
    }

    public static int min(int c, int d)
    {
        int m2;
        if (c < d)
            m2 = c;
        else
            m2 = d;

        return m2;
    }

    public static int min1(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

      /*  System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));

    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int four = min(a,b);
        if (four <= c && four <= d)
            return four;
        else if (c <= four && c <= d)
            return c;
        else
            return d;
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        int foo;
        if (a <= b)
            foo = a;
        else foo = b;
        return foo;
    }*/
}
