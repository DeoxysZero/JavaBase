package com.xiangxun.test20200113;


    public class StaticDemo {

        public static void main(String[] args) {
            StaticBean staticBean = new StaticBean("1");
            StaticBean staticBean2 = new StaticBean("2");
            StaticBean staticBean3 = new StaticBean("3");
            StaticBean staticBean4 = new StaticBean("4");
            StaticBean.age = 33;
//            StaticBean(name="1",age=    33);
//            StaticBean{name='2',age=33} ;
//            StaticBean{name='3',age=33} ;
//            StaticBean{name='4',age=33};

            System.out.println(staticBean);
            System.out.println(staticBean2);
            System.out.println(staticBean3);
            System.out.println(staticBean4);

            StaticBean.SayHello();//Hello i am java
        }
    }
