package top.horon.oop.demo05;

public class Person {

    {
        //代码块（匿名代码块），一般用来赋初始值
        System.out.println("匿名代码块");
    }

    static {
        //静态代码块，只执行一次
        System.out.println("静态代码块");
    }
    public Person(){
        System.out.println("构造方法");
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("==================");
        Person p2 = new Person();
    }
}
