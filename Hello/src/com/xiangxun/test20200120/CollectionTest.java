package com.xiangxun.test20200120;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * Collection.toArray()方法使用的坑&如何反转数组
 * 该方法是一个泛型方法：<T> T[] toArray(T[] a); 如果toArray方法中没有传递任何参数的话返回的是Object类型数组。
 *
 * String [] s= new String[]{
 *     "dog", "lazy", "a", "over", "jumps", "fox", "brown", "quick", "A"
 * };
 * List<String> list = Arrays.asList(s);
 * Collections.reverse(list);
 * s=list.toArray(new String[0]);//没有指定类型的话会报错
 * 由于JVM优化，new String[0]作为Collection.toArray()方法的参数现在使用更好，new String[0]就是起一个模板的作用，
 * 指定了返回数组的类型，0是为了节省空间，因为它只是为了说明返回的类型。
 */
public class CollectionTest {
    public static void main(String[] args) {
        String [] s= new String[]{
                "dog", "lazy", "a", "over", "jumps", "fox", "brown", "quick", "A"
        };
        List<String> list = Arrays.asList(s);
        Collections.reverse(list);
        s=list.toArray(new String[0]);//没有指定类型的话会报错
        System.out.println(Arrays.toString(s));
    }
}
