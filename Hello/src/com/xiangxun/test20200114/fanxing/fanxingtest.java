package com.xiangxun.test20200114.fanxing;

import static jdk.nashorn.internal.objects.NativeMath.min;

public class fanxingtest {

    private static <T extends Number & Comparable<? super T>> T min(T[] values) {
        if (values == null || values.length == 0) return null;
        T min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (min.compareTo(values[i]) > 0) min = values[i];
        }
        return min;
    }
//    private static <T extends  Number &Comparable<? super T>>T min(T[] values){
//
//    }

    public static void main(String[] args) {
        int minInteger = min(new Integer[]{1, 2, 3});//result:1
        double minDouble = min(new Double[]{1.2, 2.2, -1d});//result:-1d
        System.out.printf(String.valueOf(minInteger));
        System.out.println();
        System.out.printf(String.valueOf(minDouble));


        //String typeError = min(new String[]{"1","3"});//报错
    }

}

