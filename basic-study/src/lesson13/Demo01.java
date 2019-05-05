package lesson13;

public class Demo01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();

        Animal animal = new Cat();
        animal.eat();
    }
}


abstract class Animal {
    abstract public void eat ();
}


class Cat extends Animal {
    @Override
    public void eat () {
        System.out.println("猫吃鱼");
    }
}

