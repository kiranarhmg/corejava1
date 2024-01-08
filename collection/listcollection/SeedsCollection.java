package com.xworkz.profile.collection.listcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SeedsCollection {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("tomato seeds");
        list.add("apple seeds");
        list.add("orange seeds");
        list.add("chilli seeds");
        list.add("papaya seeds");
        Comparator<String> comparator=new SeedComparator();
        Collections.sort(list);
        System.out.println("list after sorting:");
        for (String val:list
             ) {
            System.out.println(val);

        }
        System.out.println("list after sorting in descending order:");

        Collections.sort(list,comparator);
        for (String val:list
        ) {
            System.out.println(val);

        }

    }
}
