package top.horon.oop.demo02;

public class Person {
    //构造方法不能有vios也没有返回类型，名字也要和类名相同
    //显式的定义构造器
    String name;
    int age;
    //无参构造
    public Person(){

    }
    //有参构造
    public Person(String name){
        this.name = name;
    }
    //定义有参构造之后，如果要使用无参构造，就要显式的定义一个无参的构造
    //Alt+Insert用于快捷生成构造器

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
