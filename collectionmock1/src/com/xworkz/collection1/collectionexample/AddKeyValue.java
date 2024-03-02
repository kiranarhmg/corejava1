package com.xworkz.collection1.collectionexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AddKeyValue {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        map.put("kiran",80);
        map.put("kumar",90);
        map.put("pavan",70);
        map.put("vijay",90);

        Set<Map.Entry<String,Integer>> set=map.entrySet();
      set.forEach(ref-> System.out.println(ref.getKey()+" : "+ref.getValue()));


    }
}
