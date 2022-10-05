package top.horon.oop.demo08;

public class Outer {
    private int id = 10;
    public void out(){
        System.out.println("这是外部类的方法");
    }
    class Inner{
        public void in(){
            System.out.println("这是内部类的方法");
        }
        //获得外部类的私有属性
        public void getID(){
            System.out.println(id);
        }
    }
    //局部内部类
    public void method(){
        class Inner{
            public void in(){

            }
        }
    }
}
//一个java类中可以有多个class类，但是只能有一个public class
class A{
    public static void main(String[] args) {

    }
}
