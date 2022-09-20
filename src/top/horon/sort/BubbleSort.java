package top.horon.sort;

import java.util.Arrays;

public class BubbleSort {   //升序
    public static void main(String[] args) {
        int[] num = {1,7,3,0,56,79,34,28};  //长度为8：0-7
        for (int i = 0;i < num.length-1;i++){ //0-5
            boolean flag = false;   //优化
            for (int j = i+1;j < num.length;j++) {
                if (num[i] >= num[j]) {
                    int swap = num[i];
                    num[i] = num[j];
                    num[j] = swap;
                    flag = true;
                }
                if (flag = false){  //未交换跳出一次内循环
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
