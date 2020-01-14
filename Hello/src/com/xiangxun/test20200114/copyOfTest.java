package com.xiangxun.test20200114;

import java.util.Arrays;

public class copyOfTest {
    public static void main(String[] args) {
        // *************复制 copy****************
        // copyOf 方法实现数组复制,h为数组，6为复制的长度
        int[] h = { 1, 2, 3, 3, 3, 3, 6, 6, 6, };
        int i[] = Arrays.copyOf(h, 6);
        System.out.println("Arrays.copyOf(h, 6);：");
        // 输出结果：123333
        for (int j : i) {
            System.out.print(j);
        }

        // 换行
        System.out.println();

        // copyOfRange将指定数组的指定范围复制到新数组中
        int j[] = Arrays.copyOfRange(h, 6, 11);
        System.out.println("Arrays.copyOfRange(h, 6, 11)：");
        // 输出结果66600(h数组只有9个元素这里是从索引6到索引11复制所以不足的就为0)
        for (int j2 : j) {
            System.out.print(j2);
        }
        // 换行
        System.out.println();
    }
}
