package com.dfbz;

/**
 * @author hjt
 * @description
 * @date 2019/8/28
 */
import java.util.ArrayList;
import java.util.HashSet;

public class Demo15 {
    public static void main(String[] args) {
        ArrayList array1 = new ArrayList();
        array1.add("a");
        array1.add("b");
        array1.add("c");
        array1.add("d");

        ArrayList array2 = new ArrayList();
        array2.add("e");
        array2.add("f");
        array2.add("a");
        array2.add("d");
        array2.add("g");

        HashSet hashSet = new HashSet();

        for (Object hs : array1){
            hashSet.add(hs);

            // System.out.println(hashSet);
        }
        for (Object hs : array2){
            hashSet.add(hs);

        }

        System.out.println(hashSet);
    }
}
