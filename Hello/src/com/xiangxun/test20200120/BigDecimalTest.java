package com.xiangxun.test20200120;

/**
 * 基本数据类型与包装数据类型的使用标准
 * Reference:《阿里巴巴Java开发手册》
 *
 * 【强制】所有的 POJO 类属性必须使用包装数据类型。
 * 【强制】RPC 方法的返回值和参数必须使用包装数据类型。
 * 【推荐】所有的局部变量使用基本数据类型。
 * 比如我们如果自定义了一个Student类,其中有一个属性是成绩score,
 * 如果用Integer而不用int定义,一次考试,学生可能没考,值是null,也可能考了,但考了0分,值是0,这两个表达的状态明显不一样.
 *
 * 说明 :POJO 类属性没有初值是提醒使用者在需要使用时，必须自己显式地进行赋值，任何 NPE 问题，或者入库检查，都由使用者来保证。
 *
 * 正例 : 数据库的查询结果可能是 null，因为自动拆箱，用基本数据类型接收有 NPE 风险。
 *
 * 反例 : 比如显示成交总额涨跌情况，即正负 x%，x 为基本数据类型，调用的 RPC 服务，
 * 调用不成功时，返回的是默认值，页面显示为 0%，这是不合理的，应该显示成中划线。
 * 所以包装数据类型的 null 值，能够表示额外的信息，如:远程调用失败，异常退出。
 */


import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        /**
         * 《阿里巴巴Java开发手册》中提到：浮点数之间的等值判断，基本数据类型不能用==来比较，
         * 包装数据类型不能用 equals 来判断。 具体原理和浮点数的编码方式有关，
         * 这里就不多提了，我们下面直接上实例：
         */
//        float a = 1.0f - 0.9f;
//        float b = 0.9f - 0.8f;
//        System.out.println(a);// 0.100000024
//        System.out.println(b);// 0.099999964
//        System.out.println(a == b);// false

        /**
         * 具有基本数学知识的我们很清楚的知道输出并不是我们想要的结果（精度丢失），
         * 我们如何解决这个问题呢？一种很常用的方法是：
         * 使用使用 BigDecimal 来定义浮点数的值，再进行浮点数的运算操作。
         */

//        BigDecimal a = new BigDecimal("1.0");
//        BigDecimal b = new BigDecimal("0.9");
//        BigDecimal c = new BigDecimal("0.8");
//        BigDecimal x = a.subtract(b);// 0.1
//        BigDecimal y = b.subtract(c);// 0.1
//        System.out.println(x.equals(y));// true

/**
 * BigDecimal 的大小比较
 * a.compareTo(b) : 返回 -1 表示小于，0 表示 等于， 1表示 大于。
 */
        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("0.9");
        System.out.println(a.compareTo(b));// 1

        /**
         * BigDecimal 保留几位小数
         * 通过 setScale方法设置保留几位小数以及保留规则。
         * 保留规则有挺多种，不需要记，IDEA会提示。
         */

        BigDecimal m = new BigDecimal("1.255433");
        BigDecimal n = m.setScale(3,BigDecimal.ROUND_HALF_DOWN);
        System.out.println(n);// 1.255
    }
}
