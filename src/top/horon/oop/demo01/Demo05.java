package top.horon.oop.demo01;
//引用传递,本质还是值传递
public class Demo05 {
    public static void main(String[] args) {
        Person person = new  Person();
        System.out.println(person.name);
        Demo05.change(person);
        System.out.println(person.name);
    }
    public  static  void change(Person person){
        person.name = "皓然";
    }
}
//定义一个类，有一个name属性
class Person{
    String name;    //默认nill
}