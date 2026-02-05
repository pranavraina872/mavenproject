package com.logicbuilding;

public class Boy {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void boy(){
        if (name.equals("pranav"))
        {
            System.out.println(name + "is male");
        } else if (name.equals("suman")) {
            System.out.println(name + "is female");

        }
    }

}
