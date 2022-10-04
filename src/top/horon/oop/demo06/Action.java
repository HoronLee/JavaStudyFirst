package top.horon.oop.demo06;
//抽象类
public abstract class Action{
    //抽象方法，只有方法名，没有方法实现
    public abstract void doSometing();
    //1. 不能new这个抽象类，只能靠子类去实现它
    //2. 抽象方法必须在抽象类中
    //3. 抽象类中可以写普通方法
}
