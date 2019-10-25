package com.dfbz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author hjt
 * @description 关卡2 案例4
 * @date 2019/8/27
 */
public class demo11 {
    public static void main(String[] args) {
        HashSet<Student> st = new HashSet<Student>();
        Student s1 = new Student("西即","男",15);
        Student s2 =new Student("的时","男",17);
        Student s3 =new Student("西即","男",15);
        Student s4 =new Student("用户","女",15);
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);

        Iterator str  = st.iterator();
        while (str.hasNext()){
            System.out.println(str.next());
        }

        for (Student S : st){
            System.out.println(S);
        }
    }


}

class Student{
    private String name;
    private String sex;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}