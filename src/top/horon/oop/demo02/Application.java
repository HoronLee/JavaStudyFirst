package top.horon.oop.demo02;
//一个项目应该只有一个主方法main
public class Application {
    public static void main(String[] args) {
        //类是抽象的，需要被实例化
        Student xiaoming = new Student();//实例化之后会返回一个自己的对象
        Student xiaohong = new Student();
        //xiaoming就是一个Student类的具体实例
        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);

        xiaoming.name = "小明";
        System.out.println(xiaoming.name);
        xiaoming.age = 18;
        System.out.println(xiaoming.age);

        xiaohong.name = "小红";
        System.out.println(xiaohong.name);
        xiaohong.age = 16;
        System.out.println(xiaohong.age);
    }
}
