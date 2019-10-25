package com.dfbz;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author hjt
 * @description 案例7
 * @date 2019/8/27
 */

    public class demo14 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            HashSet hashSet = new HashSet();

            int num=0;
            int avg=0;
            while (true){
                System.out.println("请你输入数字：");
                int i = sc.nextInt();
                if (i == -1){
                    break;
                }else {
                    hashSet.add(i);
                }
            }
            for (Object has : hashSet){
                System.out.println(has);
                num += (int)has;
            }
            System.out.println("总分："+num);
            avg = num/hashSet.size();
            System.out.println("平均分："+avg);


        }
    }