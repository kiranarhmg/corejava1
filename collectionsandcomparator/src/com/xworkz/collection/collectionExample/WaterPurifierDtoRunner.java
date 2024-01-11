package com.xworkz.collection.collectionExample;

import com.xworkz.collection.sort.SpeakerCostComparatorAsc;
import com.xworkz.collection.sort.WaterPurifierBrandComparatorAsc;
import com.xworkz.collection.sort.WaterPurifierBrandComparatorDsc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WaterPurifierDtoRunner {
    public static void main(String[] args) {
        WaterPurifierDTO waterPurifierDTO=new WaterPurifierDTO("aquaguard",10,8000,"white");
        WaterPurifierDTO waterPurifierDTO1=new WaterPurifierDTO("kent",8,6000,"blue");
        WaterPurifierDTO waterPurifierDTO2=new WaterPurifierDTO("pure it",12,9000,"white and white");
        WaterPurifierDTO waterPurifierDTO3=new WaterPurifierDTO("live pure",6,5000,"gray");

        List<WaterPurifierDTO> list=new ArrayList<>();
        list.add(waterPurifierDTO);
        list.add(waterPurifierDTO1);
        list.add(waterPurifierDTO2);
        list.add(waterPurifierDTO3);

        Comparator<WaterPurifierDTO> comparator=new WaterPurifierBrandComparatorAsc();
        Collections.sort(list,comparator);
        System.out.println("brand in asc: ");
        for (WaterPurifierDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<WaterPurifierDTO> comparator1=new WaterPurifierBrandComparatorDsc();
        Collections.sort(list,comparator1);
        System.out.println("brand in dsc: ");
        for (WaterPurifierDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");




    }
}
