package com.assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("aman");
        list.add("bimal");
        list.add("simar");
        System.out.println(list);
        for(String s: list){
            System.out.println(s);
        }
    }
}
