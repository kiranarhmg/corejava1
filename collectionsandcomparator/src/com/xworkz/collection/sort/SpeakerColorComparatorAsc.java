package com.xworkz.collection.sort;

import com.xworkz.collection.collectionExample.SensorDto;
import com.xworkz.collection.collectionExample.SpeakerDTO;

import java.util.Comparator;

public class SpeakerColorComparatorAsc implements Comparator<SpeakerDTO> {

    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {

            int n=o1.getColor().compareTo(o2.getColor());
            return n;
        }
    }

