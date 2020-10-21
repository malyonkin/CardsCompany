package app.БазовыеФункции;
//https://javarush.ru/groups/posts/1949-znakomstvo-s-klassami-napisanie-sobstvennihkh-klassov-konstruktorih
//Абстракция — выделение главных, наиболее значимых характеристик предмета

public class classCat { //шаблон описания объекта - как объект будет выглядеть и какими функциями обладать
    //свойства класса
    String name;
    int age;

    static int count = 0; //static - переменная принадлежит классу, а не выбранному объекту. Что логично: если имя у каждого кота должно быть свое, то счетчик котов нам нужен один на всех

    //конструктор. Конструктор — это, по сути, шаблон/правило для объектов класса
    /*public classCat(String name, int age) {
        this.name = name;
        this.age = age;
    }*/

    //не знаем свойства заранее
    public classCat() {
    }

    //методы класса
    public void sayMeow() {
        System.out.println("Мяу!");
    }

    public void jump() {
        System.out.println("Прыг-скок!");
    }

    //Надо каким-то образом запретить создавать котов без имени и возраста? Для этого нужны конструкторы. По сути мы говорим, как должны выглядеть объекты

    public static void cats() {
        classCat barsik = new classCat(); //создание объекта класса или одного из экземпляров класса. Сюда накладыаются ограничения от конструктора в части переменных
        barsik.age = 3;
        barsik.name = "Барсик";
        count++;

        //classCat vasia = new classCat("Вася", 5);
        //count++;

        System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
        //System.out.println("Мы создали кота по имени " + vasia.name + ", его возраст - " + vasia.age);

        System.out.println("Общее количество котов = " + count);

        barsik.jump(); //выполнение методов
        //vasia.sayMeow();
    }
}
