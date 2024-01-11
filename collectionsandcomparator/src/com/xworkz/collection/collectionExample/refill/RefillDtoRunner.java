package com.xworkz.collection.collectionExample.refill;

import com.xworkz.collection.collectionExample.SpeakerDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RefillDtoRunner {
    public static void main(String[] args) {
        RefillDTO refillDTO=new RefillDTO("renolds",7,10,5);
        RefillDTO refillDTO1=new RefillDTO("montex",8,9,10);
        RefillDTO refillDTO2=new RefillDTO("cello",6,12,6);
        RefillDTO refillDTO3=new RefillDTO("doms",5,8,3);

        List<RefillDTO> list=new ArrayList<>();
        list.add(refillDTO);
        list.add(refillDTO1);
        list.add(refillDTO2);
        list.add(refillDTO3);

        Comparator<RefillDTO> comparator=new RefillCostComparatorAsc();
                Collections.sort(list,comparator);
        System.out.println("cost in asc: ");
        for (RefillDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");
        Comparator<RefillDTO> comparator1=new RefillCostComparatorDsc();
        Collections.sort(list,comparator1);
        System.out.println("cost in dsc: ");
        for (RefillDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<RefillDTO> comparator2=new RefillHeightComparatorAsc();
        Collections.sort(list,comparator2);
        System.out.println("height in asc: ");
        for (RefillDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<RefillDTO> comparator3=new RefillHeightComparatorDsc();
        Collections.sort(list,comparator3);
        System.out.println("height in dsc: ");
        for (RefillDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<RefillDTO> comparator4=new RefillSizeComparatorAsc();
        Collections.sort(list,comparator4);
        System.out.println("size in asc: ");
        for (RefillDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<RefillDTO> comparator5=new RefillSizeComparatorDsc();
        Collections.sort(list,comparator5);
        System.out.println("size in dsc: ");
        for (RefillDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<RefillDTO> comparator6=new RefillNameComparatorAsc();
        Collections.sort(list,comparator6);
        System.out.println("name in asc: ");
        for (RefillDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");
        Comparator<RefillDTO> comparator7=new RefillNameComparatorDsc();
        Collections.sort(list,comparator7);
        System.out.println("name in dsc: ");
        for (RefillDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");




    }
}
