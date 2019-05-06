package lesson12;

public class Demo04 {
    public static void main(String[] args) {
        /**
         * 类与类：
         * 继承关系，只能是单继承，但是可以多层继承
         *
         * 类与接口
         * 实现关系，可以单实现，也可以多实现
         * 并且还可以在继承一个类的同时实现多个接口
         *
         * 接口与接口
         * 继承关系，可以单继承，也可以多继承
         */
    }
}

interface AInterface {
    public void test1();
    public void test2();
}


interface BInterface {
    public void test3();
    public void test4();
}


class A implements AInterface,BInterface {
    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }

    @Override
    public void test3() {

    }

    @Override
    public void test4() {

    }
}
