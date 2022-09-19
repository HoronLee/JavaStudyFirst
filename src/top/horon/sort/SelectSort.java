package top.horon.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        System.out.println("选择排序");
        int[] num = new int[7];
        for (int i = 0;i <= num.length-1;i++){
            num[i] = i;
        }
        for (int i = 0 ; i < (num.length-1) ;i++){  //外循环
            int swap = i;
            for (int j = i+1; j < num.length; j++) {    //内循环
                if (num[j] < num[swap]) {
                    swap = j;
                }
            }
            int temp = num[swap];   //交换元素
            num[swap] = num[i];
            num[i]=temp;
        }
        System.out.println("排序之后的数组为：" + Arrays.toString(num));
    }
}
