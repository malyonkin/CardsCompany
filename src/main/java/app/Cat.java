package app;

public class Cat {
    //свойства класса
    String name;
    int age;

    public static void cats() {
        Cat barsik = new Cat();
        barsik.age = 3;
        barsik.name = "Барсик";

        System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
    }
}
