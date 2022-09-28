package top.horon.oop.demo4;

public class Application04 {
    public static void main(String[] args) {
        //一个实例的指定类型是确定的
        //new Person();
        //new Student();

        //可以只想的引用类型就不确定了
        Student s1 = new Student();
        Person s2 = new Student();
        Object s3 = new Student();

        //子类重写父类的方法
        s2.run();//无法使用子类的eat方法
        s1.run();
    }
}
