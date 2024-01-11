package com.xworkz.collection.sort;

import com.xworkz.collection.collectionExample.WaterPurifierDTO;

import java.util.Comparator;

public class WaterPurifierBrandComparatorDsc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {

        int n = o2.getBrand().compareTo(o1.getBrand());
        return n;
    }
}
