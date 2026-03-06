package com.firstproject;

public class MaleFemale {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void MaleFemale() {
        if (name.equals("suman")){
            System.out.println(name  +"is female");
        } else if (name.equals("aman")){
            System.out.println(name  +"is  male");
        }
    }
}
