package top.horon.oop.demo3;
//学生是人
public class Student extends Person{
    /*public static void main(String[] args) {
        Student student = new Student();
        student.say();
        System.out.println(student.money);
    }*/

    public Student() {
        //隐藏代码：默认调用了父类的无参构造方法
        //调用父类的构造器的代码必须在子类构造器的上方
        super();
        System.out.println("Student无参执行");
    }

    private String name = "Horon";

    public void print() {
        System.out.println("Student");
    }
    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public void test1(){
        print();
        this.print();
        super.print();
    }
}
