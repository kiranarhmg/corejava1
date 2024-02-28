package com.collection.example.map.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethods {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("hawels",2000);
        map.put("v-guard",3000);
        map.put("orient",4000);
        map.put("bajaj",3500);

        System.out.println("keys are:");
        Set<String> set=map.keySet();
        set.forEach(ref-> System.out.println(ref));
        System.out.println("values are: ");
        Collection<Integer> collection=map.values();
        collection.forEach(ref-> System.out.println(ref));

        System.out.println("keys and values using entrySet() :");
           Set<Map.Entry<String,Integer>> map1=map.entrySet();
           map1.forEach(ref-> System.out.println(ref.getKey()+" : "+ref.getValue()));

        System.out.println("containsKey() method:");
        System.out.println(map.containsKey("orient"));
        System.out.println("containsValue");
        System.out.println(map.containsValue(4000));
        System.out.println("isEmpty() method");
        System.out.println(map.isEmpty());
        System.out.println("get() method");
        System.out.println(map.get("bajaj"));
        System.out.println("remove() method");
        System.out.println(map.remove("hawels"));
        System.out.println("after remove()");
        map.forEach((k,v)-> System.out.println(k+" "+v));
        map.put("havells",8000);
        System.out.println("after put()");
        map.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("size of map");
        System.out.println( map.size());
    }
}
