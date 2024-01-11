package com.xworkz.collection.collectionExample;

import com.xworkz.collection.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PaperDtoRunner {
    public static void main(String[] args) {
        PaperDTO paperDTO=new PaperDTO(20,23.0,"white",10);
        PaperDTO paperDTO1=new PaperDTO(30,26.0,"yellow",14);
        PaperDTO paperDTO2=new PaperDTO(25,21.20,"green",17);
        PaperDTO paperDTO3=new PaperDTO(29,25.0,"pink",12);
        PaperDTO paperDTO4=new PaperDTO(34,28.0,"blue",9);

        List<PaperDTO> list=new ArrayList<>();
        list.add(paperDTO);
        list.add(paperDTO1);
        list.add(paperDTO2);
        list.add(paperDTO3);
        list.add(paperDTO4);

        Comparator<PaperDTO> comparator=new PaperCostComparatorAsc();
        Collections.sort(list,comparator);
        System.out.println("cost in asc: ");
        for (PaperDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<PaperDTO> comparator1=new PaperCostComparatorDsc();
        Collections.sort(list,comparator1);
        System.out.println("cost in dsc: ");
        for (PaperDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<PaperDTO> comparator2=new PaperWeightComparatorAsc();
        Collections.sort(list,comparator2);
        System.out.println("weight in asc: ");
        for (PaperDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<PaperDTO> comparator4=new PaperColorComparatorAsc();
        Collections.sort(list,comparator4);
        System.out.println("color in asc: ");
        for (PaperDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<PaperDTO> comparator5=new PaperWeightComparatorDsc();
        Collections.sort(list,comparator5);
        System.out.println("color in dsc: ");
        for (PaperDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<PaperDTO> comparator6=new PaperHeightComparatorAsc();
        Collections.sort(list,comparator6);
        System.out.println("height in asc: ");
        for (PaperDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<PaperDTO> comparator7=new PaperHeightComparatorDsc();
        Collections.sort(list,comparator7);
        System.out.println("height in asc: ");
        for (PaperDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");


    }
}
