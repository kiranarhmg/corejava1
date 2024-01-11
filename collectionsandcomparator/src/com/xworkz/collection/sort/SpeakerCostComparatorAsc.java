package com.xworkz.collection.sort;

import com.xworkz.collection.collectionExample.SpeakerDTO;

import java.util.Comparator;

public class SpeakerCostComparatorAsc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
