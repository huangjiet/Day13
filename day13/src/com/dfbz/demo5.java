package com.dfbz;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author hjt
 * @description  关卡1 案例8
 * @date 2019/8/27
 */
public class demo5 {
    public static void main(String[] args) {
        Set link = new LinkedHashSet<>();
        link.add("王昭君");
        link.add("王昭君");
        link.add("西施");
        link.add("杨玉环");
        link.add("貂蝉");

        Iterator ll  = link.iterator();
        while (ll.hasNext()){
            System.out.println(ll.next());
        }
        System.out.println("---------");
        for (Object lin: link){
            System.out.println(lin);
        }
    }
}
