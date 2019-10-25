package com.dfbz;

import java.util.LinkedList;
import java.util.List;

/**
 * @author hjt
 * @description 关卡1 案例4
 * @date 2019/8/27
 */
public class demo2 {
    public static void main(String[] args) {
         List list = new LinkedList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         ((LinkedList) list).addFirst(0);
         ((LinkedList) list).addLast(6);

        System.out.println(((LinkedList) list).getFirst());
        System.out.println(((LinkedList) list).getLast());
        System.out.println(list);
        ((LinkedList) list).removeFirst();
        ((LinkedList) list).removeLast();
        System.out.println(list);
    }
}
