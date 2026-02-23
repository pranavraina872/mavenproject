package com.inheritance;

import javax.management.ObjectInstance;

public class MainCollege {
    public static void main(String[] args) {
        VaishnoCollege vaishnoCollege = new VaishnoCollege();
        AbcCollege abcCollege = new AbcCollege();
        Hptu hptu = new Hptu();
        vaishnoCollege.vaishnoCollege();
        vaishnoCollege.test();
        abcCollege.abcCollege();
        vaishnoCollege.test();
        hptu.hptu();


    }
}
