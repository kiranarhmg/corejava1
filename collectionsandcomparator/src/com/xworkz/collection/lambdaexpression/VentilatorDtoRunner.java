package com.xworkz.collection.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VentilatorDtoRunner {
    public static void main(String[] args) {
        VentilatorDTO ventilatorDTO=new VentilatorDTO(100000,20,10,"ymr");
        VentilatorDTO ventilatorDTO2 = new VentilatorDTO(120000, 25, 12, "XZT");
        VentilatorDTO ventilatorDTO3 = new VentilatorDTO(90000, 18, 8, "ABC");

        List<VentilatorDTO> list=new ArrayList<>();
        list.add(ventilatorDTO);
        list.add(ventilatorDTO2);
        list.add(ventilatorDTO3);
        Collections.sort(list,(l1, l2)->(Double.compare(l2.getCost(), l1.getCost())));
        System.out.println("cost in dsc");
        for (VentilatorDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1, l2)->(Double.compare(l1.getCost(), l2.getCost())));
        System.out.println("cost in asc");
        for (VentilatorDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l2.getMaxPressure(), l1.getMaxPressure())));
        System.out.println("pressure in dsc");
        for (VentilatorDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l1.getMaxPressure(), l2.getMaxPressure())));
        System.out.println("pressure in asc");
        for (VentilatorDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l2.getMaxVolume(), l1.getMaxVolume())));
        System.out.println("max volume in dsc");
        for (VentilatorDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l1.getMaxVolume(), l2.getMaxVolume())));
        System.out.println("max volume in asc");
        for (VentilatorDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(l1.getModel().compareTo(l2.getModel())));
        System.out.println("model in asc");
        for (VentilatorDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(l2.getModel().compareTo(l1.getModel())));
        System.out.println("model in asc");
        for (VentilatorDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
    }
}
