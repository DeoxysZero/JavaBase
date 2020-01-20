package com.xiangxun.test20200119;


//正确使用equals

import java.util.Objects;

public class StringTest {
    public static void main(String[] args) {

        //空指针异常
        String str = null;
//        if (str.equals("SnailClimb")) {
//        } else {
//        }

        //可以用的方法
        System.out.println("SnailClimb".equals(str));// false


        //好方法 jdk7引进的
        /**源码
         * public static boolean equals(Object a, Object b) {
         *         // 可以避免空指针异常。如果a==null的话此时a.equals(b)就不会得到执行，避免出现空指针异常。
         *         return (a == b) || (a != null && a.equals(b));
         *     }
         */
        System.out.println(Objects.equals(null,"SnailClimb"));// false

    }
}
