package com.xiangxun.test20200114;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//array :fill  asList copyOf()
public class TestDK {
    public static void main(String[] args) {
        int[] g = { 1, 2, 3, 3, 3, 3, 6, 6, 6 };
        // 数组中所有元素重新分配值
        Arrays.fill(g, 3);
        System.out.println("Arrays.fill(g, 3)：");
        for (int i : g) {
            System.out.print(i);
        }
        System.out.printf(Arrays.toString(g));
        // 输出结果：333333333
        int[] h = { 1, 2, 3, 3, 3, 3, 6, 6, 6, };
        // 数组中指定范围元素重新分配值
        Arrays.fill(h, 0, 3, 9);
        System.out.println("Arrays.fill(h, 0, 3, 9);：");
        // 输出结果：993333666
        for (int i : h) {
            System.out.print(i);
        }
        // *************转列表 asList()****************
        /*
         * 返回由指定数组支持的固定大小的列表。
         * （将返回的列表更改为“写入数组”。）该方法作为基于数组和基于集合的API之间的桥梁，与Collection.toArray()相结合 。
         * 返回的列表是可序列化的，并实现RandomAccess 。
         * 此方法还提供了一种方便的方式来创建一个初始化为包含几个元素的固定大小的列表如下：
         */
        List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");

        System.out.println(stooges);
        String[] k = { "aaf","dsaasd" };
        System.out.println(Arrays.toString(k));



    }
}
