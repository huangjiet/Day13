package com.dfbz;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author hjt
 * @description 关卡2 案例1
 * @date 2019/8/27
 */
public class demo8 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");


        HashSet<String> kk = new HashSet<String>();
        kk.addAll(list);
        System.out.println(list);
        System.out.println(kk);
        list.clear();

        for (Object set:kk){
            list.add(set);
        }

        System.out.println(list);

    }
}
