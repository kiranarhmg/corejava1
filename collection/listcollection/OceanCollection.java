package com.xworkz.profile.collection.listcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OceanCollection {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("indian ocean");
        list.add("Atlantic Ocean");
        list.add("Pacific Ocean");
        list.add("Arctic Ocean");
        list.add("Southern Ocean");
        list.add("Antarctic Ocean");
        list.add("North Atlantic Ocean");
        list.add("South Atlantic Ocean");
        list.add("North Pacific Ocean");
        list.add("South Pacific Ocean");
        Collections.sort(list);
        for (String val:list
        ) {
            System.out.println(val);

        }
        Comparator<String> comparator=new OceanComparator();


        Collections.sort(list,comparator);
        System.out.println("list after sorting in descending order:");
        for (String val:list
        ) {
            System.out.println(val);

        }
    }
}
