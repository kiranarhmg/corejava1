package com.xworkz.collection.collectionExample.belt;

import com.xworkz.collection.collectionExample.refill.RefillDTO;

import java.util.Comparator;

public class BeltCostComparatorAsc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}

class BeltCostComparatorDsc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}

class BeltSizeComparatorAsc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Double.compare(o1.getSize(), o2.getSize());
    }
}
class BeltSizeComparatorDsc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Double.compare(o2.getSize(), o1.getSize());
    }
}

class BeltBrandComparatorAsc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        int n = o1.getBrand().compareTo(o2.getBrand());
        return n;
    }
}
class BeltBrandComparatorDsc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        int n = o2.getBrand().compareTo(o1.getBrand());
        return n;
    }
}
class BeltColorComparatorAsc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        int n = o1.getColor().compareTo(o2.getColor());
        return n;
    }
}
class BeltColorComparatorDsc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        int n = o2.getColor().compareTo(o1.getColor());
        return n;
    }
}

