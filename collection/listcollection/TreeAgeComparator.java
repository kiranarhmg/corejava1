package com.xworkz.profile.collection.listcollection;

import java.util.Comparator;

public class TreeAgeComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        int n=o2.compareTo(o1);
        return n;
    }
}
