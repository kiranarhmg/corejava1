package com.xworkz.collection.collectionExample.belt;

import com.xworkz.collection.collectionExample.SensorDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BeltDtoRunner {
    public static void main(String[] args) {
        BeltDTO beltDTO=new BeltDTO("gucci",600,30,"black");
        BeltDTO beltDTO1=new BeltDTO("prada",500,28,"brown");
        BeltDTO beltDTO2=new BeltDTO("fendi",700,35,"gray");
        BeltDTO beltDTO3=new BeltDTO("armani",800,40,"green");

        List<BeltDTO> list=new ArrayList<>();
        list.add(beltDTO);
        list.add(beltDTO1);
        list.add(beltDTO2);
        list.add(beltDTO3);

        Comparator<BeltDTO> comparator=new BeltCostComparatorAsc();
                Collections.sort(list,comparator);
        System.out.println("cost in asc: ");
        for (BeltDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<BeltDTO> comparator1=new BeltCostComparatorDsc();
        Collections.sort(list,comparator1);
        System.out.println("cost in dsc: ");
        for (BeltDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<BeltDTO> comparator2=new BeltBrandComparatorAsc();
        Collections.sort(list,comparator2);
        System.out.println("brand in asc: ");
        for (BeltDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<BeltDTO> comparator3=new BeltBrandComparatorDsc();
        Collections.sort(list,comparator3);
        System.out.println("brand in dsc: ");
        for (BeltDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");
        Comparator<BeltDTO> comparator4=new BeltSizeComparatorAsc();
        Collections.sort(list,comparator4);
        System.out.println("size in asc: ");
        for (BeltDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<BeltDTO> comparator5=new BeltSizeComparatorDsc();
        Collections.sort(list,comparator5);
        System.out.println("size in dsc: ");
        for (BeltDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");
        Comparator<BeltDTO> comparator6=new BeltColorComparatorAsc();
        Collections.sort(list,comparator6);
        System.out.println("color in asc: ");
        for (BeltDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");
        Comparator<BeltDTO> comparator7=new BeltColorComparatorDsc();
        Collections.sort(list,comparator7);
        System.out.println("color in dsc: ");
        for (BeltDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");






    }
}
