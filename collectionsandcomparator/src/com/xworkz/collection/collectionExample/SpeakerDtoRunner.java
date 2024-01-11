package com.xworkz.collection.collectionExample;

import com.xworkz.collection.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SpeakerDtoRunner {
    public static void main(String[] args) {
        SpeakerDTO speakerDTO=new SpeakerDTO("sony",10000,"black",10.0);
        SpeakerDTO speakerDTO1=new SpeakerDTO("samsung",15000,"brown",15.0);
        SpeakerDTO speakerDTO2=new SpeakerDTO("philips",14000,"red",10.8);
        SpeakerDTO speakerDTO3=new SpeakerDTO("mi",9000,"gray",10.3);

        List<SpeakerDTO> list=new ArrayList<>();
        list.add(speakerDTO);
        list.add(speakerDTO1);
        list.add(speakerDTO2);
        list.add(speakerDTO3);

        Comparator<SpeakerDTO> comparator=new SpeakerCostComparatorAsc();
                Collections.sort(list,comparator);
        System.out.println("cost in asc: ");
        for (SpeakerDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<SpeakerDTO> comparator1=new SpeakerCostComparatorDsc();
        Collections.sort(list,comparator1);
        System.out.println("cost in dsc: ");
        for (SpeakerDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<SpeakerDTO> comparator2=new SpeakerColorComparatorAsc();
        Collections.sort(list,comparator2);
        System.out.println("color in asc: ");
        for (SpeakerDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<SpeakerDTO> comparator3=new SpeakerColorComparatorDsc();
        Collections.sort(list,comparator3);
        System.out.println("color in dsc: ");
        for (SpeakerDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<SpeakerDTO> comparator4=new SpeakerSizeComparatorAsc();
        Collections.sort(list,comparator4);
        System.out.println("size in asc: ");
        for (SpeakerDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<SpeakerDTO> comparator5=new SpeakerSizeComparatorDsc();
        Collections.sort(list,comparator5);
        System.out.println("size in dsc: ");
        for (SpeakerDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<SpeakerDTO> comparator6=new SpeakerBrandComparatorAsc();
        Collections.sort(list,comparator6);
        System.out.println("brand in asc: ");
        for (SpeakerDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<SpeakerDTO> comparator7=new SpeakerBrandComparatorDsc();
        Collections.sort(list,comparator7);
        System.out.println("brand in dsc: ");
        for (SpeakerDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");





    }
}
