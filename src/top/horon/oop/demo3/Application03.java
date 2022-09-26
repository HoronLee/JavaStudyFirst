package top.horon.oop.demo3;



public class Application03 {
    //静态和非静态方法区别很大
    //非静态才才能重写，而且重写一定是public的方法
    public static void main(String[] args) {
        //方法的调用只和定义的数据类型油管
        A a = new A();
        a.test();

        //父类的引用指向了子类
        B b = new A();
        b.test();
    }
}
