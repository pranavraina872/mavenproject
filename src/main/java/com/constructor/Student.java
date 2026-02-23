package com.constructor;

public class Student {
    private String name;
    private int age;
    private String address;
    private int rollNo;
    private String email;
    private String password;

    public Student(String name, int age, String address, int rollNo, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.rollNo = rollNo;
        this.email = email;
    }
    Student(String name) {
        this.name = name;

    }
    Student(String name,int age) {
        this.age = age;
        this.name = name;
    }
    Student(int age ,String address, int rollNo) {
        this.age = age;
        this.address = address;
        this.rollNo = rollNo;
    }
    Student(String name,int age,String address,int rollNo) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.rollNo = rollNo;
    }
    Student(String name,int age,String address ,int rollNo ,String email ,String password) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.rollNo = rollNo;
        this.password = password;
    }

}

