package com.dfbz;

import java.util.HashSet;

/**
 * @author hjt
 * @description  关卡2 案例2
 * @date 2019/8/27
 */
public class demo9 {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("二丫");
        set.add("钱六");
        set.add("孙七");

        System.out.println(set);

        set.remove("二丫");
        System.out.println(set);
        set.add("王二丫");
        System.out.println(set);
    }
}
