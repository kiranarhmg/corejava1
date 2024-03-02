package com.xworkz.collection1.collectionexample;

import java.util.HashMap;

public class GetValueAssociatedToKey {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("kiran",40);
        map.put("kumar",80);
        System.out.println(map.get("kumar"));
    }
}
