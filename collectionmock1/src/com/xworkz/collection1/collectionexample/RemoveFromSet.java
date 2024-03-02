package com.xworkz.collection1.collectionexample;

import java.util.HashSet;
import java.util.Set;

public class RemoveFromSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println("set before remove");
        set.forEach(ref-> System.out.println(ref));
        set.remove(10);
        System.out.println("set after remove");
        set.forEach(ref-> System.out.println(ref));
    }
}
