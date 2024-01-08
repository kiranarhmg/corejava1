package com.xworkz.profile.collection.listcollection;

import java.util.Comparator;

public class SeedComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int ref=o2.compareTo(o1);
        return ref;
    }
}
