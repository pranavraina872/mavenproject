package com.inheritance;

public class College {
    private String CollegeName;
    private String course;

    public String getCollegeName() {
        return CollegeName;
    }

    public void setCollegeName(String collegeName) {
        CollegeName = collegeName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;

    }
    public void test(){
        System.out.println("test");
    }
}
