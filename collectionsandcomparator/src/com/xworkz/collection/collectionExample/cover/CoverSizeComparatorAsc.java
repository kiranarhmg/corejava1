package com.xworkz.collection.collectionExample.cover;

import java.util.Comparator;

public class CoverSizeComparatorAsc implements Comparator<CoverDTO> {

    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o1.getSize(),o2.getSize());
    }
}
 class CoverSizeComparatorDsc implements Comparator<CoverDTO> {

    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o2.getSize(),o1.getSize());
    }
}
class CoverCapacityComparatorAsc implements Comparator<CoverDTO> {

    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o1.getCapacity(),o2.getCapacity());
    }
}
class CoverCapacityComparatorDsc implements Comparator<CoverDTO> {

    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o2.getCapacity(),o1.getCapacity());
    }
}
class CoverBrandComparatorAsc implements Comparator<CoverDTO> {

    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        int n=o1.getBrand().compareTo(o2.getBrand());
        return n;
    }
}
class CoverBrandComparatorDsc implements Comparator<CoverDTO> {

    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        int n=o2.getBrand().compareTo(o1.getBrand());
        return n;
    }
}
class CoverColorComparatorDsc implements Comparator<CoverDTO> {

    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        int n=o2.getColor().compareTo(o1.getColor());
        return n;
    }
}
class CoverColorComparatorAsc implements Comparator<CoverDTO> {

    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        int n=o1.getColor().compareTo(o2.getColor());
        return n;
    }
}
