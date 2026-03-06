package com.list;

import java.util.ArrayList;
import java.util.List;

public class MainManyValues {
    public static void main(String[] args) {
        ManyValues manyValues = new ManyValues();
        List<String> names=new ArrayList<>();
        names.add("aman");
        names.add("raj");
                names.add("rajan");
                manyValues.setNames(names);
                List<Integer> age=new ArrayList<>();
                age.add(20);
                age.add(30);
                age.add(40);
                manyValues.setAges(age);
        System.out.println(manyValues);

    }
}
