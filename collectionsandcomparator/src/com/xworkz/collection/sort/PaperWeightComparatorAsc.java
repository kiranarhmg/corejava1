package com.xworkz.collection.sort;

import com.xworkz.collection.collectionExample.PaperDTO;

import java.util.Comparator;

public class PaperWeightComparatorAsc implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return Double.compare(o1.getWeight(), o2.getWeight());
    }
}
