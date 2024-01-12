package com.xworkz.collection.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThermometerDtoRunner {
    public static void main(String[] args) {
        ThermometerDTO thermometerDTO=new ThermometerDTO("cipla",35,10,3000);
        ThermometerDTO thermometerDTO2 = new ThermometerDTO("Abbott", 38, 8, 2500);
        ThermometerDTO thermometerDTO3 = new ThermometerDTO("Braun", 40, 5, 4000);
        ThermometerDTO thermometerDTO4 = new ThermometerDTO("Omron", 36, 12, 3200);

        List<ThermometerDTO> list=new ArrayList<>();
        list.add(thermometerDTO);
        list.add(thermometerDTO2);
        list.add(thermometerDTO3);
        list.add(thermometerDTO4);

        Collections.sort(list,(l1, l2)->(Double.compare(l1.getTemperature(), l2.getTemperature())));
        System.out.println("temperature in asc");
        for (ThermometerDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l2.getTemperature(), l1.getTemperature())));
        System.out.println("temperature in dsc");
        for (ThermometerDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1, l2)->(Double.compare(l1.getResponseTime(), l2.getResponseTime())));
        System.out.println("response time in asc");
        for (ThermometerDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l2.getResponseTime(), l1.getResponseTime())));
        System.out.println("response time in dsc");
        for (ThermometerDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l1.getCost(), l2.getCost())));
        System.out.println("cost in asc");
        for (ThermometerDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l2.getCost(), l1.getCost())));
        System.out.println("cost in dsc");
        for (ThermometerDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(l1.getBrand().compareTo(l2.getBrand())));
        System.out.println("brand in asc");
        for (ThermometerDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(l2.getBrand().compareTo(l1.getBrand())));
        System.out.println("brand in dsc");
        for (ThermometerDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
    }
}
