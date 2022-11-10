package top.horon.javaclub;

import java.util.Scanner;

public class CustomMpTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用自定义乘法表生成器，你需要查看乘法表（1）还是自定义一份乘法表（2）？");
        int mode = scanner.nextInt();
        System.out.println("==============================");
        if(mode == 1){
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < i+1; j++) {
                    System.out.print(i + "+" + j + "=" + (i+j));
                }
                System.out.println();
            }
        }else if (mode == 2){
            System.out.println("请输入你需要生成的乘法表的最大乘数：");
            int maxMultiNum = scanner.nextInt();
            System.out.println("==============================");
            for (int i = 1; i <= maxMultiNum; i++) {
                for (int j = 1; j < i+1; j++) {
                    System.out.print(i + "+" + j + "=" + (i+j) + " ");
                }
                System.out.println();
            }
        }
        System.out.println("==============================");
        System.out.println("欢迎下次继续使用~");
    }
}
