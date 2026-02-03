package com.DataTypes;

public class MainSubject {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.setSubject("maths");
        subject.setMarks(50);
        System.out.println(subject.getSubject());
        System.out.println(subject.getMarks());

    }
}
