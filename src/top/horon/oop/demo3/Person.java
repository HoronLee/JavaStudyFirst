package top.horon.oop.demo3;
//人
public class Person {
    //public
    //protected
    //default
    //private
    /*public  int money = 10_0000_0000;
    private int wife = 0;
    public void say(){
        System.out.println("说了一句话");
    }
    public void getwife(){
        this.wife = wife;
    }*/

    public Person() {
        System.out.println("Person无参执行");
    }

    protected String name = "皓然";

    public void print(){
        System.out.println("Person");
    }
}
