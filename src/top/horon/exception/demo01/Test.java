package top.horon.exception.demo01;

public class Test {
    //可能存在异常的方法
    static void test(int a) throws Myexception {
        System.out.println("传递的参数为："+ a);
        if (a>10){
            throw new Myexception(a);//抛出
        }
        System.out.println("OK");
    }

    public static void main(String[] args) {
        try {
            test(11);
        } catch (Myexception e) {
            System.out.println("Myexception=>"+e);
        }
    }
}
