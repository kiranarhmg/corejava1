package com.xworkz.collection.sort;

import com.xworkz.collection.collectionExample.SpeakerDTO;

import java.util.Comparator;

public class SpeakerSizeComparatorAsc implements Comparator<SpeakerDTO> {


    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Double.compare(o1.getSize(), o2.getSize());
    }
}
