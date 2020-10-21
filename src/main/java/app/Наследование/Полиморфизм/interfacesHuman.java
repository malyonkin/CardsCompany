package app.Наследование.Полиморфизм;

import app.БазовыеФункции.interfaceSwim;

public class interfacesHuman implements interfaceSwim {
    //Ограничения в наследовании - каждый тип может иметь одного родителя (суперкласс) и неограниченное количество наследников (подклассов). Поэтому для добавления нескольких функциональностей в классы используются интерфейсы.
    private String name;
    private int age;

    public interfacesHuman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(toString()+" Я плаваю с помощью надувного круга.");
    }

    @Override
    public String toString() {
        return "Я " + name + ", мне " + age + " лет. ";
    }

    public static class Fish implements interfaceSwim {
        private String name;

        public Fish(String name) {
            this.name = name;
        }

        @Override
        public void swim() {
            System.out.println("Я рыба " + name + ". Я плыву, двигая плавниками.");

        }
    }

        public static class UBoat implements interfaceSwim {

            private int speed;

            public UBoat(int speed) {
                this.speed = speed;
            }

            @Override
            public void swim() {
                System.out.println("Подводная лодка плывет, вращая винты, со скоростью " + speed + " узлов.");
            }
        }
}
