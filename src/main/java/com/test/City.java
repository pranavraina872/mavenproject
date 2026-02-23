package com.test;

public class City {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void city(){
        if (name.equals("sumanjk")){
            System.out.println(name + "FEMALE");
        } else if (name.equals("aman")) {
            System.out.println(name + "MALE");

        }
    }
}
