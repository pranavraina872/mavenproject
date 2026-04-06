package com.assignment;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<String>
                set = new HashSet<String>();
        set.add("electricityKwh");
        set.add("electricityKwh");
        set.add("petrolLitres");
        set.add("wastage");
        System.out.println(set);
        for(String s: set){
            System.out.println(s);
        }

    }
}
