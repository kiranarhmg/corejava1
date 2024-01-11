package com.xworkz.collection.sort;

import com.xworkz.collection.collectionExample.SensorDto;

import java.util.Comparator;

public class SensorTypeComparatorDsc implements Comparator<SensorDto> {
    @Override
    public int compare(SensorDto o1, SensorDto o2) {
        int n=o2.getType().compareTo(o1.getType());
        return n;
    }
}
