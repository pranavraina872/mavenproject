package com.list;

import java.util.List;

public class ManyValues {
    private List<String> names;
    private List<Integer> ages;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        System.out.println(names);
        this.names = names;
    }

    public List<Integer> getAges() {
        return ages;
    }

    public void setAges(List<Integer> ages) {
        System.out.println(ages);
        this.ages = ages;
    }

    @Override
    public String toString() {
        return "ManyValues{" +
                "names=" + names +
                ", ages=" + ages +
                '}';
    }
}
