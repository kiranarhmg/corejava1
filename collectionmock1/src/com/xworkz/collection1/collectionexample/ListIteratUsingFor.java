package com.xworkz.collection1.collectionexample;

import java.util.ArrayList;
import java.util.List;

public class ListIteratUsingFor {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for (Integer i:list) {
            System.out.println(i);
        }

    }
}
