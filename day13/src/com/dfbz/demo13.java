package com.dfbz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * @author hjt
 * @description 关卡2 案例6
 * @date 2019/8/27
 */
public class demo13 {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();

        Random s = new Random();

        while (set.size() < 10) {

            Integer i = s.nextInt(20) + 1;

            if (!set.contains(i)) {
                set.add(i);

            }

           // System.out.println(i + "--------" + set.size());

        }




       Iterator hset = set.iterator();

        while (hset.hasNext()){

            Object next = hset.next();

            System.out.println(next);

        }


    }
}
