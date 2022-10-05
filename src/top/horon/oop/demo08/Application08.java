package top.horon.oop.demo08;

public class Application08 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //通过这个外部类来实现内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getID();
    }
}
