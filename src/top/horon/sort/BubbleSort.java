package top.horon.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] num = {1,7,3,0,56,79,34,28};  //长度为8：0-7
        for (int i = 0;i < num.length-1;i++){ //0-5
            for (int j = i+1;j < num.length;j++) {
                if (num[i] > num[j]) {
                    int swap = num[i];
                    num[i] = num[j];
                    num[j] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
