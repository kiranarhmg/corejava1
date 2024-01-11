package com.xworkz.collection.sort;

import com.xworkz.collection.collectionExample.SpeakerDTO;

import java.util.Comparator;

public class SpeakerBrandComparatorAsc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {

        int n=o1.getBrand().compareTo(o2.getBrand());
        return n;
    }
}
