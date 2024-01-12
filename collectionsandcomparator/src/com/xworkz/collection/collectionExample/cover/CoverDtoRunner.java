package com.xworkz.collection.collectionExample.cover;


import com.xworkz.collection.collectionExample.charcoal.CharcoalDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CoverDtoRunner {
    public static void main(String[] args) {
        CoverDTO coverDTO=new CoverDTO(10,"blue",5,"shri");
        CoverDTO coverDTO2 = new CoverDTO(15, "red", 8, "Royal Covers");
        CoverDTO coverDTO3 = new CoverDTO(20, "green", 6, "Elite Brands");
        CoverDTO coverDTO4 = new CoverDTO(12, "yellow", 7, "Premium Covers");

        List<CoverDTO> list=new ArrayList<>();
        list.add(coverDTO);
        list.add(coverDTO2);
        list.add(coverDTO3);
        list.add(coverDTO4);

        Comparator<CoverDTO> comparator=new CoverSizeComparatorAsc();
        Collections.sort(list,comparator);
        System.out.println("size in asc: ");
        for (CoverDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************");

        Comparator<CoverDTO> comparator1=new CoverSizeComparatorDsc();
        Collections.sort(list,comparator1);
        System.out.println("size in dsc: ");
        for (CoverDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************");

        Comparator<CoverDTO> comparator2=new CoverBrandComparatorAsc();
        Collections.sort(list,comparator2);
        System.out.println("brand in asc: ");
        for (CoverDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************");
        Comparator<CoverDTO> comparator3=new CoverBrandComparatorDsc();
        Collections.sort(list,comparator3);
        System.out.println("brand in dsc: ");
        for (CoverDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************");
        Comparator<CoverDTO> comparator4=new CoverColorComparatorDsc();
        Collections.sort(list,comparator4);
        System.out.println("color in dsc: ");
        for (CoverDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************");
        Comparator<CoverDTO> comparator5=new CoverColorComparatorAsc();
        Collections.sort(list,comparator5);
        System.out.println("color in asc: ");
        for (CoverDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************");
        Comparator<CoverDTO> comparator6=new CoverCapacityComparatorDsc();
        Collections.sort(list,comparator6);
        System.out.println("capacity in dsc: ");
        for (CoverDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************");
        Comparator<CoverDTO> comparator7=new CoverCapacityComparatorAsc();
        Collections.sort(list,comparator7);
        System.out.println("capacity in asc: ");
        for (CoverDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************");
    }
}
