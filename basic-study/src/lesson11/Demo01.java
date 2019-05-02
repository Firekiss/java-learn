package lesson11;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * Java 的重写只存在子类和父类之间
         * 子类和父类出现了一模一样的方法
         *
         * 什么时候要使用到重写
         * 当子类需要使用父类的功能,但是子类又有自己的特殊内容的时候
         * 重写父类的方法, super.父类方法() 再加上自己特有的内容即可
         */
        Son son = new Son();
        son.drive();


        /**
         * 重写和重载的区别
         *
         * 重载 overload 是在同一个类里面进行的
         * 重载只和参数列表有关系, 与权限和返回值没有任何的关系
         * 重载是为了扩充不同的参数的情况
         *
         * 重写 override 在父子类中
         * 子类方法和父类必须保持完全的一致
         * 重写是为了让子类在父类的基础之上扩充父类的方法
         */
    }
}


class Father {
    public void drive () {
        System.out.println("父亲的方法");
    }
}


class Son extends Father {
    @Override
    public void drive () {
        super.drive();
        System.out.println("儿子的方法");
    }
}
