package com.xworkz.collection.sort;

import com.xworkz.collection.collectionExample.PaperDTO;

import java.util.Comparator;

public class PaperColorComparatorDsc implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        int n=o2.getColor().compareTo(o1.getColor());
        return n;
    }
}
