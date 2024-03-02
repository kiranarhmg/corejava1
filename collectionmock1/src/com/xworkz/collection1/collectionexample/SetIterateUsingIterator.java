package com.xworkz.collection1.collectionexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterateUsingIterator {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();

        set.add(100);
        set.add(200);
        set.add(300);

        Iterator<Integer> iterator= set.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
