package com.xiangxun.test20200120;

import java.util.Arrays;
import java.util.List;

/**
 * arrays.aslist()
 */


/**
 * /**
 *  *返回由指定数组支持的固定大小的列表。此方法作为基于数组和基于集合的API之间的桥梁，
 *  与  Collection.toArray()结合使用。返回的List是可序列化并实现RandomAccess接口。
 *
 public static<T> List<T> asList(T...a){
        return new ArrayList<>(a);
        }
 */

public class MYarray {
    public static void main(String[] args) {
        String[] myArray = { "Apple", "Banana", "Orange" };
        List<String> myList = Arrays.asList(myArray);
//上面两个语句等价于下面一条语句
       // List<String> myList = Arrays.asList("Apple","Banana", "Orange");

        System.out.println(myList);
    }
}
