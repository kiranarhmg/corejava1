package com.xworkz.collection.sort;

import com.xworkz.collection.collectionExample.SpeakerDTO;
import com.xworkz.collection.collectionExample.WaterPurifierDTO;

import java.util.Comparator;

public class WaterPurifierBrandComparatorAsc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {

        int n = o1.getBrand().compareTo(o2.getBrand());
        return n;
    }
}




