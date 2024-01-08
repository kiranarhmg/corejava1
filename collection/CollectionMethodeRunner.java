package com.xworkz.profile.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionMethodeRunner {
    public static void main(String[] args) {
        CollectionMethods collectionMethods=new CollectionMethods();
        Collection<String> mehods=collectionMethods.runner();
        Collection<String> m=new ArrayList<>();
        Collections.addAll(m,"add","remove","clear");
        mehods.retainAll(m);
        for (String val:mehods
             ) {
            System.out.println(val);

        }
        System.out.println("size of collection: "+ mehods.size());

        mehods.removeAll(mehods);
        System.out.println(mehods.isEmpty());
        mehods.add("add");
        mehods.clear();
        Collections.addAll(mehods,"addall","remove");
        if(mehods.contains("remove"))
        {
            System.out.println(  "removed value:"+mehods.remove("remove"));
        }

        System.out.println(mehods.containsAll(m));
        System.out.println(mehods.equals(m));
        m.toArray();
        for (String val:m
        ) {
            System.out.println(val);

        }



        for (String val:mehods
             ) {
            System.out.println(val);

        }


    }
}
