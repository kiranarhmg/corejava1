package com.xworkz.collection.sort;

import com.xworkz.collection.collectionExample.SensorDto;

import java.util.Comparator;

public class SensorTypeComparatorAsc implements Comparator<SensorDto> {

    @Override
    public int compare(SensorDto o1, SensorDto o2) {

            int n=o1.getType().compareTo(o2.getType());
            return n;

    }
}
