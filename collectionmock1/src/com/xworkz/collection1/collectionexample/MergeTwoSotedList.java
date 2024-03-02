package com.xworkz.collection1.collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSotedList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);

        Collections.sort(list);
        List<Integer> list1=new ArrayList<>();
        list1.add(30);
        list1.add(40);
        list1.add(35);

         Collections.sort(list1);

        list.addAll(list1);

        list.forEach(ref-> System.out.println(ref));
    }
}
