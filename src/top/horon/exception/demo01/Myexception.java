package top.horon.exception.demo01;
//自定义的异常类
public class Myexception extends Exception{
    //传递数字>10；
    private int detail;

    public Myexception(int a) {
        this.detail = a;
    }
    //tpstring
    //异常的打印信息
    @Override
    public String toString() {
        return "Myexception{" + "detail=" + detail + '}';
    }
}
