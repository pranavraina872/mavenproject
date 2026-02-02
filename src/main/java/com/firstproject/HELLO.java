package com.firstproject;

import java.sql.SQLOutput;

public class HELLO {
    public static void main(String[]args){
        Student student = new Student();
student.setAge(18);
student.setName("pranav");
        System.out.println(student.getName());
        System.out.println(student.getAge());
}
}