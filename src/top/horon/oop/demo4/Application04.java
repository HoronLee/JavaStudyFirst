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

        Person obj = new Student();
        //两种强制转换都可以
        Student student = (Student) obj;
        ((Student) obj).go();
        student.go();
        //子类转化为父类，可能会丢失自己原来的一些方法
        Person persion = student;
        /*
        Object object = new Student();
        System.out.println(object instanceof Student);
        System.out.println(object instanceof Person);
        System.out.println(object instanceof Teacher);
        System.out.println(object instanceof String);
        System.out.println("==============");
        Person person = new Student();
        System.out.println(person instanceof Student);
        System.out.println(person instanceof Person);
        System.out.println(person instanceof Object);
        System.out.println(person instanceof Teacher);
        //System.out.println(person instanceof String);//编译报错
        System.out.println("==============");
        Student student = new Student();
        System.out.println(student instanceof Student);
        System.out.println(student instanceof Person);
        //System.out.println(student instanceof Teacher);//编译报错
        //System.out.println(student instanceof String);//编译报错
        */
    }
}
