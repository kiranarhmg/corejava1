package com.collection.example.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LandOwner {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("rural land","kumar");
        map.put("urban land","pavan");
       
        System.out.println("*********keys************");
        Set<String> set= map.keySet();
        set.forEach(ref-> System.out.println(ref));
        Collection<String> collection=map.values();
        System.out.println("**************values******************");
        collection.forEach(ref-> System.out.println(ref));
    }
}
