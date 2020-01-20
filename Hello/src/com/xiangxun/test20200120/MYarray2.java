package com.xiangxun.test20200120;


/**
 * 《阿里巴巴Java 开发手册》对其的描述
 * Arrays.asList()将数组转换为集合后,底层其实还是数组，《阿里巴巴Java 开发手册》对于这个方法有如下描述：
 * 本质还是数组，不能用集合的修改方式，add/remove/clear修改，会抛出异常。
 * asList体现的是适配器模式，后台数据仍是数组
 */


import java.util.Arrays;
import java.util.List;

/**
 * 传递的数组必须是对象数组，而不是基本类型。
 * Arrays.asList()是泛型方法，传入的对象必须是对象数组。
 */
public class MYarray2 {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};
        // Integer[] myArray = { 1, 2, 3 };
        List myList = Arrays.asList(myArray);
        System.out.println(myList);
        System.out.println(myList.size());//1
        System.out.println(myList.get(0));//数组地址值
        //System.out.println(myList.get(1));//报错：ArrayIndexOutOfBoundsException
        int[] array = (int[]) myList.get(0);
        System.out.println(array[0]);//1

//        当传入一个原生数据类型数组时，Arrays.asList() 的真正得到的参数就不是数组中的元素，而是数组对象本身！此时List 的唯一元素就是这个数组，这也就解释了上面的代码。
//
//        我们使用包装类型数组就可以解决这个问题。
//
//        Integer[] myArray = { 1, 2, 3 };

    }
}
