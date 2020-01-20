package com.xiangxun.test20200120;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("1");
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            String item=iterator.next();

            if(true){
                iterator.remove();
            }
        }


//        for(String item:list){
//            if("1".equals(item)){
//                list.remove(item);
//            }
//        }
        System.out.println(list);




    }
}
