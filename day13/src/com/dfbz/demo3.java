package com.dfbz;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author hjt
 * @description 关卡1 案例5
 * @date 2019/8/27
 */
public class demo3 {
    public static void main(String[] args) {
         HashSet hs = new HashSet<>();
         hs.add("zhuansan");
         hs.add("lisi");
         hs.add("wangwu");

        Iterator o = hs.iterator();
        while (o.hasNext()){
            System.out.println(o.next());
        }

    }
}
