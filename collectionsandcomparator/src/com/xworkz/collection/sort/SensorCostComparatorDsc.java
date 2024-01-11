package com.xworkz.collection.sort;

import com.xworkz.collection.collectionExample.SensorDto;

import java.util.Comparator;

public class SensorCostComparatorDsc implements Comparator<SensorDto> {
    @Override
    public int compare(SensorDto o1, SensorDto o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}
