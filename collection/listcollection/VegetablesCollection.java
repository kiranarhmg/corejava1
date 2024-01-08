package com.xworkz.profile.collection.listcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VegetablesCollection {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("carrot");
        list.add("betrrot");
        list.add("tomato");
        list.add("onion");
        list.add("chilli");
        list.add("potato");
        list.add("ladies finger");
        list.add("brinjal");
        list.add("beans");
        list.add("bitter guard");
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
