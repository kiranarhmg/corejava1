package com.xworkz.collection.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SkyWalkDtoRunner {
    public static void main(String[] args) {
        SkyWalkDTO skyWalkDTO=new SkyWalkDTO(20,30,300,"kbr");
        SkyWalkDTO skyWalkDTO1=new SkyWalkDTO(30,35,320,"mra");
        SkyWalkDTO skyWalkDTO2=new SkyWalkDTO(40,40,400,"llr");

        List<SkyWalkDTO> list=new ArrayList<>();
        list.add(skyWalkDTO);
        list.add(skyWalkDTO1);
        list.add(skyWalkDTO2);

        Comparator<SkyWalkDTO> comparator=(l1,l2)->{
            return Double.compare(l1.getLenght(), l2.getLenght());
        } ;
        Collections.sort(list,comparator);
        System.out.println("length in asc");
        for (SkyWalkDTO val:list
             ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1,l2)->(Double.compare(l2.getLenght(), l1.getLenght())));
        System.out.println("length in dsc");
        for (SkyWalkDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1,l2)->(Double.compare(l2.getHeight(), l1.getHeight())));
        System.out.println("height in dsc");
        for (SkyWalkDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1,l2)->(Double.compare(l1.getHeight(), l2.getHeight())));
        System.out.println("height in asc");
        for (SkyWalkDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1,l2)->(Double.compare(l2.getCapacity(), l1.getCapacity())));
        System.out.println("capacity in dsc");
        for (SkyWalkDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1,l2)->(Double.compare(l1.getCapacity(), l2.getCapacity())));
        System.out.println("capacity in asc");
        for (SkyWalkDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1,l2)->(l1.getName().compareTo(l2.getName())));
        System.out.println("name in asc");
        for (SkyWalkDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1,l2)->(l2.getName().compareTo(l1.getName())));
        System.out.println("name in dsc");
        for (SkyWalkDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");



    }
}
