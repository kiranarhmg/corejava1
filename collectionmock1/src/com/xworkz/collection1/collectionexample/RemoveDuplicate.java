package com.xworkz.collection1.collectionexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("kiran");
        list.add("kumar");
        list.add("pavan");
        list.add("kumar");

        System.out.println("before remove duplicate");
        list.forEach(ref-> System.out.println(ref));

    }
}
