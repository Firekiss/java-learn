package lesson12;

public class Demo01 {
    /**
     * 多态学习
     *
     * Java中多态的前提
     *  要有继承关系
     *  要有方法重写
     *  要有父类引用指向子类对象
     *
     *  多态中访问
     *
     *      成员变量: 编译看左边(父类), 运行看左边(父类)
     *      成员方法: 编译看左边(父类), 运行看右边(子类)
     *      静态方法: 编译看左边(父类), 运行看右边(子类)
     *
     *
     *  多态中的类型转换
     *
     *  向上转型  子类对象赋值给父类变量
     *  向下转型  父类的真实对象必须是子类对象,否则会有问题
     */

    public static void main(String[] args) {
        Person p = new SuperMan();
//        System.out.println(p.name);
//        p.fly();

        // 强制向下类型转换
        SuperMan sm = (SuperMan) p;
        System.out.println(sm.name);
        sm.fly();
    }
}


class Person {
    String name = "普通人类";

    public void fly () {
        System.out.println("普通人不会飞");
    }
}


class SuperMan extends Person{
    String name = "超人";

    @Override
    public void fly () {
        System.out.println("超人在飞翔");
    }
}
