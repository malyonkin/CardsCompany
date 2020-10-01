package app;

public class Cat {
    //свойства класса
    String name;
    int age;

    public static void cats() {
        Cat barsik = new Cat(); //создание объекта класса
        barsik.age = 2;
        barsik.name = "Барсик1";

        System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
    }
}
