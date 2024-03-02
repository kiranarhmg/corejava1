package com.xworkz.collection1.collectionexample;

import java.util.HashSet;
import java.util.Set;

public class CheckForElement {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(100);
        set.add(200);
        set.add(300);

        System.out.println(set.contains(100));


    }
}
