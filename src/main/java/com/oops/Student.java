package com.oops;

public class Student {
    private String firstname;
    private String lastname;
    private int age;
    public String getFirstname(String firstname) {
        return this.firstname;
    }
    public String getLastname(String lastname) {
        return this.lastname;
    }
    public int getAge(int age) {
        return this.age;
    }
    public Student(){}
    public Student(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    }

