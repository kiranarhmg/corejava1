package com.xworkz.profile.collection.listcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TreeAge {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(21);
        list.add(36);
        list.add(56);
        list.add(70);
        Collections.sort(list);
        for (int val:list
             ) {
            System.out.println(val);
        }
        Comparator<Integer> comparator=new TreeAgeComparator();
        Collections.sort(list,comparator);
        System.out.println("list sorted in descending order:");
        for (int val:list
        ) {
            System.out.println(val);
        }
    }
}
