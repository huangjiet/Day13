package com.dfbz;

import java.util.HashSet;

/**
 * @author hjt
 * @description 关卡1 案例7
 * @date 2019/8/27
 */
public class demo4 {
    public static void main(String[] args) {
         HashSet<Person> person = new HashSet<Person>();

         Person pers  = new Person("XIAO D ",20);
         person.add(pers);
         person.add( new Person("XIAO D ",20));
         person.add( new Person("XIAO D ",20));
         person.add( new Person("XIAO f ",22));
         person.add( new Person("XIAO x ",21));

         for (Person person1 : person){
             System.out.println(person1.getName()+person1.getAge());
         }

    }
}

