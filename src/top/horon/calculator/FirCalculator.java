package top.horon.calculator;

import java.util.Scanner;

public class FirCalculator {
    public static void main(String[] args){
        System.out.println("欢迎使用皓然简易计算器V0.0.1——支持加+ 减- 乘* 除/ ");   //给用户使用提示
        System.out.println("请输入你想要计算的式子中的第一个数值(请使用整数)，然后Enter");
        Scanner shuzhi1 = new Scanner(System.in);    //创建键盘扫描器
        if (shuzhi1.hasNext()){
            int shu1 = Integer.parseInt(shuzhi1.next());
            System.out.println("需要计算的第一个数为：" + shu1);
            //下一步
            System.out.println("请输入你需要计算的运算符【 + - * / 】然后Enter");
            Scanner yunsuan = new  Scanner(System.in);
            if(yunsuan.hasNext()){
                String yun = yunsuan.next();
                System.out.println("你输入的运算符为：" + yun);
                //下一步
                System.out.println("请输入你想要计算的式子中的第二个数值，然后Enter");
                Scanner shuzhi2 = new Scanner(System.in);
                if(shuzhi2.hasNext()){
                    int shu2 = Integer.parseInt(shuzhi2.next());
                    System.out.println("需要计算的第二个数为：" + shu2);
                    System.out.println("===========计算中-请耐心等待==========");
                    System.out.println("计算结果是：" + calculate(shu1,yun,shu2));
                    System.out.println("===计算完成！PS：虽然根本不用多少毫秒===");
                    shuzhi2.close();    //关闭占用资源的扫描器
                }else {
                    System.out.println("你似乎还没有键入第二个运算数值呢...");
                    shuzhi2.close();
                }
            }else {
                System.out.println("你似乎还没有键入任何运算符呢...");
                yunsuan.close();            //关闭占用资源的扫描器
            }
        }else {
            System.out.println("你似乎还没有键入任何数值呢...");
        }
        shuzhi1.close();                             //关闭占用资源的扫描器
    }
    public static double calculate(int shu1, String yunsuan, int shu2){
        switch (yunsuan){
            case "+":
                return shu1 + shu2;
            case "-":
                return shu1 - shu2;
            case  "*":
                return (double) shu1 * shu2;
            case "/":
                return (double) shu1 / shu2;
            default:
                System.out.println("你输入的是什么运算符暂时不支持哦");
        }
        return 0;
    }
}
