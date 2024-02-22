package com.collection.example.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CarModel {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("maruthi",2020);
        map.put("tata",2021);
        map.put("kia",2022);
        System.out.println("*********keys************");
        Set<String> set= map.keySet();
        set.forEach(ref-> System.out.println(ref));
        Collection<Integer> collection=map.values();
        System.out.println("**************values******************");
        collection.forEach(ref-> System.out.println(ref));
    }
}
