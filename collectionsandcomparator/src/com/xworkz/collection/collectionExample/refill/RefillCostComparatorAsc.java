package com.xworkz.collection.collectionExample.refill;

import java.util.Comparator;

public class RefillCostComparatorAsc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
class RefillCostComparatorDsc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}
 class RefillNameComparatorAsc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        int n=o1.getRefillName().compareTo(o2.getRefillName());
        return n;
    }

    }
class RefillNameComparatorDsc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        int n=o2.getRefillName().compareTo(o1.getRefillName());
        return n;
    }

}
class RefillSizeComparatorDsc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Double.compare(o2.getSize(), o1.getSize());
    }
}
class RefillSizeComparatorAsc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Double.compare(o1.getSize(), o2.getSize());
    }
}
class RefillHeightComparatorDsc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Double.compare(o2.getHeight(), o1.getHeight());
    }
}
class RefillHeightComparatorAsc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Double.compare(o1.getHeight(), o2.getHeight());
    }
}
