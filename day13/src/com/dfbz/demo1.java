package com.dfbz;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author hjt
 * @description  关卡1 案例3
 * @date 2019/8/27
 */
public class demo1 {
    public static void main(String[] args) {
        List list = new LinkedList<>();
        list.add(111);
        list.add(222);
        list.add(111);
        list.add(444);
        list.add(3,5555);
        list.set(3,333);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.get(0));
        list.clear();

    }
}
