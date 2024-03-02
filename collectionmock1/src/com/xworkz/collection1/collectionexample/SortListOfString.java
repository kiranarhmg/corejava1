package com.xworkz.collection1.collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListOfString {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("dvg");
        list.add("blr");
        list.add("hvr");

        Collections.sort(list,(p1,p2)->p1.compareTo(p2));
        System.out.println(list);

    }
}
