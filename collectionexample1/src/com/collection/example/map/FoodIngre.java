package com.collection.example.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FoodIngre {
    public static void main(String[] args) {
        String[] inggredients={"onion","chilli","tomato"};
        Map<String,String[]> map=new HashMap<>();
        map.put("kitchen wall",inggredients);
        map.put("bed room wall",inggredients);
        map.put("living area",inggredients);
        System.out.println("*********keys************");
        Set<String> set= map.keySet();
        set.forEach(ref-> System.out.println(ref));
        for (String[] str:map.values()) {
            for (String str1:str) {
                System.out.println(str1);

            }
        }
    }
}
