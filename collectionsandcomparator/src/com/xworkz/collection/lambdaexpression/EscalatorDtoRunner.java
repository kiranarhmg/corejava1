package com.xworkz.collection.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EscalatorDtoRunner {
    public static void main(String[] args) {
        EscalatorDTO escalatorDTO=new EscalatorDTO(10,50,40,20);
        EscalatorDTO escalatorDTO2 = new EscalatorDTO(8, 40, 35, 18);
        EscalatorDTO escalatorDTO3 = new EscalatorDTO(12, 60, 45, 25);
        EscalatorDTO escalatorDTO4 = new EscalatorDTO(15, 70, 50, 30);

        List<EscalatorDTO> list=new ArrayList<>();
        list.add(escalatorDTO);
        list.add(escalatorDTO2);
        list.add(escalatorDTO3);
        list.add(escalatorDTO4);
        Comparator<EscalatorDTO> comparator=(l1,l2)->{return Double.compare(l1.getSpeed(), l2.getSpeed()); };

        Collections.sort(list,comparator);
        System.out.println("speed in asc");
        for (EscalatorDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l2.getSpeed(), l1.getSpeed())));
        System.out.println("speed in dsc");
        for (EscalatorDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l1.getCapacity(), l2.getCapacity())));
        System.out.println("capacity in asc");
        for (EscalatorDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l2.getCapacity(), l1.getCapacity())));
        System.out.println("capacity in dsc");
        for (EscalatorDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1, l2)->(Double.compare(l1.getNoOfSteps(), l2.getNoOfSteps())));
        System.out.println("no of steps in asc");
        for (EscalatorDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l2.getNoOfSteps(), l1.getNoOfSteps())));
        System.out.println("no of steps in dsc");
        for (EscalatorDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l2.getLenght(), l1.getLenght())));
        System.out.println("length in dsc");
        for (EscalatorDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l1.getLenght(), l2.getLenght())));
        System.out.println("length in asc");
        for (EscalatorDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

    }
}
