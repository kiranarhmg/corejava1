package com.xworkz.collection.collectionExample.charcoal;


import com.xworkz.collection.collectionExample.plug.SparkPlugDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CharcoalRunner {
    public static void main(String[] args) {
        CharcoalDTO charcoalDTO=new CharcoalDTO(200,20000,"good","zindal");
        CharcoalDTO charcoalDTO1=new CharcoalDTO(300,60000,"normal","bhadra");
        CharcoalDTO charcoalDTO2 = new CharcoalDTO(150, 18000, "excellent", "Charcoal Inc.");
        CharcoalDTO charcoalDTO3 = new CharcoalDTO(300, 25000, "premium", "BlackGold");
        CharcoalDTO charcoalDTO4 = new CharcoalDTO(100, 15000, "high-grade", "EcoChar");

        List<CharcoalDTO> list=new ArrayList<>();
        list.add(charcoalDTO);
        list.add(charcoalDTO1);
        list.add(charcoalDTO2);
        list.add(charcoalDTO3);

        Comparator<CharcoalDTO> comparator=new CharCoalCompanyComparatorAsc();
        Collections.sort(list,comparator);
        System.out.println("company in asc: ");
        for (CharcoalDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************");
        Comparator<CharcoalDTO> comparator1=new CharCoalCompanyComparatorDsc();
        Collections.sort(list,comparator1);
        System.out.println("company in dsc: ");
        for (CharcoalDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("****************************************");


        Comparator<CharcoalDTO> comparator3=new CharCoalPriceComparatorDsc();
        Collections.sort(list,comparator3);
        System.out.println("price in dsc: ");
        for (CharcoalDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("****************************************");
        Comparator<CharcoalDTO> comparator4=new CharCoalPriceComparatorAsc();
        Collections.sort(list,comparator4);
        System.out.println("price in asc: ");
        for (CharcoalDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("****************************************");
        Comparator<CharcoalDTO> comparator5=new CharCoalQuantityComparatorDsc();
        Collections.sort(list,comparator5);
        System.out.println("quantity in dsc: ");
        for (CharcoalDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("****************************************");
        Comparator<CharcoalDTO> comparator6=new CharCoalQuantityComparatorAsc();
        Collections.sort(list,comparator6);
        System.out.println("quantity in asc: ");
        for (CharcoalDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("****************************************");
        Comparator<CharcoalDTO> comparator7=new CharCoalQualityComparatorDsc();
        Collections.sort(list,comparator7);
        System.out.println("quality in dsc: ");
        for (CharcoalDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("****************************************");
        Comparator<CharcoalDTO> comparator8=new CharCoalQualityComparatorAsc();
        Collections.sort(list,comparator8);
        System.out.println("quality in asc: ");
        for (CharcoalDTO val:list
        ) {
            System.out.println(val);
        }



    }
}
