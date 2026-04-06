package com.assignment;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String,Double>
                map= new HashMap<String,Double>();
        map.put("electricityKwh",20.0);
        map.put("petrolLiters",50.0);
        map.put("wastage",250.0);
        System.out.println(map);
        for(Map.Entry<String,Double>m :map.entrySet()) {
            System.out.println("Key : " + m.getKey()+ ",value: "+ m.getValue());
        }
    }
}
