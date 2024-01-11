package com.xworkz.collection.sort;

import com.xworkz.collection.collectionExample.SensorDto;

import java.util.Comparator;

public class SensorNameComparatorAsc implements Comparator<SensorDto> {
    @Override
    public int compare(SensorDto o1, SensorDto o2) {
        int n=o1.getName().compareTo(o2.getName());
        return n;
    }
}
