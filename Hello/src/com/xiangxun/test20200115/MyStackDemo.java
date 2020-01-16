package com.xiangxun.test20200115;

import java.util.Arrays;

/**用数组完成栈
 * 1肯定是数组
 * 2栈的容量 等于数组的长度
 * 3栈中元素多少  当下标用
 *
 * 入栈
 * 出栈
 * 查看栈顶元素
 * 栈的大小
 *      元素超了最大值，扩容数组
 *      是否栈空
 * 查看栈内随机下标的元素
 *
 *纯手打无难度英文编写
 */


public class MyStackDemo {
    private int [] shuzu; //数组
    private int zhan;  //栈的容量
    private int RK;  //元素总量

    private static final int BUBIANZHI=2; //后补的为了扩容给的固定值。

    // TODO: 2020/1/16 练习，无参构造
    public MyStackDemo(){
        this.shuzu=new int[8];  //默认给8
        this.zhan=8;
        this.RK=0;
    }

    // TODO: 2020/1/16 有参构造
    public MyStackDemo(int chushizhi){
        if(chushizhi<1){
            throw new IllegalArgumentException("最少也得是一啊");
        }
        this.shuzu=new int[chushizhi];
        this.zhan=chushizhi;
        this.RK=0;
    }

    // TODO: 2020/1/16 入栈
    public void Add(int yuansu){

        if(zhan<=0){
            throw new IllegalArgumentException("栈为空！");
        }
        kuorong();
        shuzu[RK]=yuansu;
        RK++;
    }

    // TODO: 2020/1/16 出栈
    public int chuzhan(){
        if(zhan<=0&&RK==zhan){
            throw new IllegalArgumentException("爆栈！");
        }
        int kb;
        kb=shuzu[RK-1];
        shuzu[RK-1]= 0;
        RK--;


        return kb;
    }

    // TODO: 2020/1/16 查看栈顶元素
    public int kanzhanding(){
        if(zhan<=0&&RK==zhan){
            throw new IllegalArgumentException("爆栈！");
        }
        return shuzu[RK-1];
    }



    // TODO: 2020/1/16 查看随机下标的元素

    // TODO: 2020/1/16  扩容
    public void kuorong(){
//        if(zhan<=0)
        if(RK==zhan){
            int newshuzu=shuzu.length*BUBIANZHI;
            shuzu=Arrays.copyOf(shuzu,newshuzu);
            zhan=newshuzu;
        }
//        System.out.println("现在的栈的大小是：");
//        System.out.println(zhan);
    }

    // TODO: 2020/1/16  栈空
    public boolean kong(){
        if(RK==0){
            return true;
        }else {
            return false;
        }

    }


    public static void main(String[] args) {
        MyStackDemo myStackDemo=new MyStackDemo(3);
        myStackDemo.Add(1);
        myStackDemo.Add(2);
        myStackDemo.Add(3);
        myStackDemo.Add(4);
        myStackDemo.Add(5);
        myStackDemo.Add(6);
        myStackDemo.Add(7);
        myStackDemo.Add(8);
        for(int i=0;i<myStackDemo.RK;i++)
        System.out.println(myStackDemo.shuzu[i]);
        System.out.println(myStackDemo.kong()); //不是空栈
        System.out.println(myStackDemo.kanzhanding());
        myStackDemo.chuzhan();
        myStackDemo.chuzhan();
        myStackDemo.chuzhan();
        myStackDemo.chuzhan();
        myStackDemo.chuzhan();
        myStackDemo.chuzhan();
        myStackDemo.chuzhan();
        for(int i=0;i<myStackDemo.RK;i++)
            System.out.println(myStackDemo.shuzu[i]);
        System.out.println(Arrays.toString(myStackDemo.shuzu));



    }

}
