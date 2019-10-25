package com.dfbz;

/**
 * @author hjt
 * @description
 * @date 2019/8/28
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class demo16 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new Studente("圣诞节",20,80));
        hs.add(new Studente("圣诞节",20,80));
        hs.add(new Studente("迪斯科",20,90));
        hs.add(new Studente("熊积分",20,95));

        Iterator lj = hs.iterator();

        while(lj.hasNext()){
            Object next =  lj.next();
            System.out.println(next);
        }

        int num = 0;
        int maxnum = 0;


    }


}




class Studente{
    private  String name;
    private  int age;
    private  int cenj;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cenj=" + cenj +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studente student = (Studente) o;
        return age == student.age &&
                cenj == student.cenj &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, cenj);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCenj() {
        return cenj;
    }

    public void setCenj(int cenj) {
        this.cenj = cenj;
    }

    public Studente() {
    }

    public Studente(String name, int age, int cenj) {
        this.name = name;
        this.age = age;
        this.cenj = cenj;
    }
}