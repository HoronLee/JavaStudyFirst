package top.horon.calculator;

import java.util.Scanner;

public class FirstCalculator {

    public static void main(String[] args) {
        System.out.println("欢迎使用皓然的建议计算器");
        System.out.println("Version-0.0.2");
        System.out.println("计算方式为分布输入，请先输入你的算式中的第一个数字→");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("您输入的第一个数字为→" + num1 + ", 现在请输入运算符[ + - * / ]→");
        String calculator = scanner.next();
        switch (calculator){
            case "+":
                System.out.println("您将要进行加法操作，"+ "现在请输入第二个数字→");
                break;
            case "-":
                System.out.println("您将要进行减法操作，"+ "现在请输入第二个数字→");
                break;
            case "*":
                System.out.println("您将要进行乘法操作，"+ "现在请输入第二个数字→");
                break;
            case "/":
                System.out.println("您将要进行除法操作，"+ ",现在请输入第二个数字→");
                break;
            default:
                System.out.println("抱歉，皓然计算器暂时不支持您输入的运算符哦！");
        }
        int num2 = scanner.nextInt();
        System.out.println("您输入的第二个数字为→" + num2);
        System.out.println("===计算中===");
        System.out.println("计算结果为：" + calculate(num1,calculator,num2));
        System.out.println("==计算结束==");
    }
    public static double calculate(int num1,String calculator,int num2){
        switch (calculator){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return (double)num1 * num2;
            case "/":
                return (double)num2 / num2;
            default:
                return 0;
        }
    }
}
