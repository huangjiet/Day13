package com.dfbz;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author hjt
 * @description  关卡1 案例9
 * @date 2019/8/27
 */
public class demo6 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();
        arr.add(33);
        arr.add(11);
        arr.add(77);
        arr.add(55);

        Collections.sort(arr);
        System.out.println(arr);
        Collections.shuffle(arr);
        System.out.println(arr);
        Collections.reverse(arr);

        for (Object S :arr){
            System.out.println(S);
        }
    }
}
