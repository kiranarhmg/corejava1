package com.xworkz.collection.collectionExample.plug;



import java.util.Comparator;

public class SparkPlugCostComparatorAsc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}

class SparkPlugCostComparatorDsc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}
class SparkPlugSizeComparatorAsc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Double.compare(o1.getSize(), o2.getSize());
    }
}
class SparkPlugSizeComparatorDsc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Double.compare(o2.getSize(), o1.getSize());
    }
}
class SparkPlugQuantityComparatorAsc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Double.compare(o1.getQuantity(), o2.getQuantity());
    }
}
class SparkPlugQuantityComparatorDsc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Double.compare(o2.getQuantity(), o1.getQuantity());
    }
}
class SparkPlugBrandComparatorAsc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        int n=o1.getBrand().compareTo(o2.getBrand());
        return n;
    }
}
class SparkPlugBrandComparatorDsc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        int n=o2.getBrand().compareTo(o1.getBrand());
        return n;
    }
}
