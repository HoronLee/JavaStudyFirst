package top.horon.oop.demo3;
import top.horon.oop.demo3.Student;

public class Application02 {
    public static void main(String[] args) {
        Student student = new Student();
        //student.test("horon");
        student.test1();
    }
}
/*
Note:
1. Super调用父类构造方法，必须在构造方法中的第一个
2. super只能出现在子类的方法或者构造方法中
3. super和this不能痛失调用构造方法

    this：本身调用着这个对象
        没有继承也能使用
        this();本类的对象
    super：代表父类对象的应用
        比如有继承关系才能用
        super();父类的对象

 */
