package com.xworkz.collection.collectionExample.plug;

import com.xworkz.collection.collectionExample.refill.RefillDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SparkPlugDtoRunner {
    public static void main(String[] args) {
        SparkPlugDTO sparkPlugDTO=new SparkPlugDTO(150,2,"hero",2);
        SparkPlugDTO sparkPlugDTO1=new SparkPlugDTO(170,5,"tvs",1);
        SparkPlugDTO sparkPlugDTO2=new SparkPlugDTO(190,3,"yamaha",4);
        SparkPlugDTO sparkPlugDTO3=new SparkPlugDTO(130,1,"honda",3);

        List<SparkPlugDTO> list=new ArrayList<>();
        list.add(sparkPlugDTO);
        list.add(sparkPlugDTO1);
        list.add(sparkPlugDTO2);
        list.add(sparkPlugDTO3);

        Comparator<SparkPlugDTO> comparator=new SparkPlugBrandComparatorAsc();
        Collections.sort(list,comparator);
        System.out.println("brand in asc: ");
        for (SparkPlugDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");
        Comparator<SparkPlugDTO> comparator1=new SparkPlugBrandComparatorDsc();
        Collections.sort(list,comparator1);
        System.out.println("brand in dsc: ");
        for (SparkPlugDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<SparkPlugDTO> comparator2=new SparkPlugSizeComparatorAsc();
        Collections.sort(list,comparator2);
        System.out.println("size in asc: ");
        for (SparkPlugDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");
        Comparator<SparkPlugDTO> comparator3=new SparkPlugSizeComparatorDsc();
        Collections.sort(list,comparator3);
        System.out.println("size in dsc: ");
        for (SparkPlugDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<SparkPlugDTO> comparator4=new SparkPlugCostComparatorAsc();
        Collections.sort(list,comparator4);
        System.out.println("cost in asc: ");
        for (SparkPlugDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<SparkPlugDTO> comparator5=new SparkPlugCostComparatorDsc();
        Collections.sort(list,comparator5);
        System.out.println("cost in dsc: ");
        for (SparkPlugDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<SparkPlugDTO> comparator6=new SparkPlugQuantityComparatorAsc();
        Collections.sort(list,comparator6);
        System.out.println("quantity in asc: ");
        for (SparkPlugDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");
        Comparator<SparkPlugDTO> comparator7=new SparkPlugQuantityComparatorDsc();
        Collections.sort(list,comparator7);
        System.out.println("quantity in asc: ");
        for (SparkPlugDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");







    }
}
