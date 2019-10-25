package com.dfbz;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author hjt
 * @description 关卡 2  案例5
 * @date 2019/8/27
 */
public class demo12 {
    public static void main(String[] args) {
        String arr[] = {"abc","bad","abc","aab","bad","cfe","hjk"};
         HashSet set = new HashSet<>();

         for (String s : arr){
             set.add(s);
         }
        System.out.println(set);

         ArrayList list = new ArrayList<>();
         list.addAll(set);
        System.out.println(list);
    }
}
