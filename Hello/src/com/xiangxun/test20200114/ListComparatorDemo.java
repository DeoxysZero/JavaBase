package com.xiangxun.test20200114;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListComparatorDemo {
    public static void main(String[] args) {
//定义一个list集合，用来存放对象，可以这样写:Collections.sort(list,new 实现类())
        List<PersonComparator> list = new ArrayList<PersonComparator>();
        list.add(new PersonComparator("小A", 23));
        list.add(new PersonComparator("小H", 21));
        list.add(new PersonComparator("小G", 25));
        list.add(new PersonComparator("小E", 24));
        list.add(new PersonComparator("小W", 43));
        list.add(new PersonComparator("小D", 25));
//调用Collecttions.sort排序方法
        Collections.sort(list, new Comparator<PersonComparator>() {
            //复写Comparator的compara接口
            @Override
            public int compare(PersonComparator o1, PersonComparator o2) {
                if (o1.getAge() == o2.getAge()) {
//名字按照拼音字母先後顺序(小到大)是o1.getName().compareTo(o2.getName)
                    return o1.getName().compareTo(o2.getName());
                } else {
//从小到大排序 o1 - o2
//从大到小排序 o2 - o1
                    return o1.getAge() - o2.getAge();
                }
            }
        });

//遍历
        for (PersonComparator person : list) {
            System.out.println(person.getName() + "   " + person.getAge());
        }
    }
}

//创建一个类
class PersonComparator {
//声明成员变量
    private String name;
    private int age;
//声明构造器
    public PersonComparator(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    //创建getter 和 setter 方法
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

