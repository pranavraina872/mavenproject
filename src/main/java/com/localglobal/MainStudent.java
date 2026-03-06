package com.localglobal;

public class MainStudent {
    public static void main(String[] args) {
        Student s=new Student("test",12);
        s.setAge(20);
        s.setName("pranav");
        System.out.println("Name:"+s.getName());
        System.out.println("Age:"+s.getAge());
    }
}
