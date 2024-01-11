package com.xworkz.collection.sort;

import com.xworkz.collection.collectionExample.SpeakerDTO;

import java.util.Comparator;

public class SpeakerColorComparatorDsc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {

        int n=o2.getColor().compareTo(o1.getColor());
        return n;
    }
}
