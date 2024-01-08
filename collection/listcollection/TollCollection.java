package com.xworkz.profile.collection.listcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TollCollection {
    public static void main(String[] args) {
        List<Double> list=new ArrayList<Double>();
                list.add(22.3);
        list.add(45.9);
        list.add(70.50);
        list.add(100.23);
        list.add(89.40);
        list.add(60.50);
        list.add(203.30);
        list.add(40.22);
        list.add(56.90);
        list.add(390.0);
        Collections.sort(list);
        for (double val:list
             ) {
            System.out.println(val);
        }
        Comparator<Double> comparator=new TollComparator();
        Collections.sort(list,comparator);
        System.out.println("list sorted in descending order:");
        for (double val:list
        ) {
            System.out.println(val);
        }

    }
}
