package app.Наследование.Полиморфизм;

public class polymorphismDancer {
    //Полиморфизм - один интерфейс, множество методов
    private String name;
    private int age;

    public polymorphismDancer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dance() {
        System.out.println(toString() + "Я танцую как все.");
    }

    @Override
    public String toString() {
        return "Я " + name + ", мне " + age + " лет. " ;
    }

    public static class ElectricBoogieDancer extends polymorphismDancer { //Наследование
        public ElectricBoogieDancer(String name, int age) {
            super(name, age);
        }

        // переопределение метода базового класса
        @Override //анотация для переопределения метода - нужно компелятору
        public void dance() {
            System.out.println(toString() + "Я танцую электрик буги!");
        }
    }

    public static class breakDance extends polymorphismDancer {

        public breakDance(String name, int age) {
            super(name, age);
        }

        // переопределение метода базового класса
        @Override
        public void dance() {
            System.out.println(toString() + "Я танцую брейк-данс!");
        }
    }
}
