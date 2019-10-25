package com.dfbz;

import java.util.ArrayList;

/**
 * @author hjt
 * @description  关卡1 案例10
 * @date 2019/8/27
 */
public class demo7 {
    public static void main(String[] args) {
        ArrayList J  = add("sdsddd");
        for (Object p : J) {
            System.out.println(J);
        }
    }


    static ArrayList add(String... str){
        ArrayList array = new ArrayList<>();
        for (Object d :str){
            array.add(d);
        }
        return array;
    }
}
