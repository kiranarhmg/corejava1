package com.xworkz.collection.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeyserDtoRunner {
    public static void main(String[] args) {
        GeyserDTO geyserDTO=new GeyserDTO("vguard",5000,1,8);
        GeyserDTO geyserDTO2 = new GeyserDTO("Bajaj", 6000, 2, 7);
        GeyserDTO geyserDTO3 = new GeyserDTO("AO Smith", 8000, 3, 10);
        GeyserDTO geyserDTO4 = new GeyserDTO("Havells", 7000, 2, 9);

        List<GeyserDTO> list=new ArrayList<>();
        list.add(geyserDTO);
        list.add(geyserDTO2);
        list.add(geyserDTO3);
        list.add(geyserDTO4);
        Collections.sort(list,(l1, l2)->(Double.compare(l2.getPrice(), l1.getPrice())));
        System.out.println("price in dsc");
        for (GeyserDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1, l2)->(Double.compare(l1.getPrice(), l2.getPrice())));
        System.out.println("price in asc");
        for (GeyserDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l2.getWarranty(), l1.getWarranty())));
        System.out.println("warranty in dsc");
        for (GeyserDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l1.getWarranty(), l2.getWarranty())));
        System.out.println("warranty in asc");
        for (GeyserDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l2.getVolume(), l1.getVolume())));
        System.out.println("volume in dsc");
        for (GeyserDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1, l2)->(Double.compare(l1.getVolume(), l2.getVolume())));
        System.out.println("volume in asc");
        for (GeyserDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1,l2)->(l1.getBrand().compareTo(l2.getBrand())));
        System.out.println("brand in asc");
        for (GeyserDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1,l2)->(l2.getBrand().compareTo(l1.getBrand())));
        System.out.println("brand in dsc");
        for (GeyserDTO val:list
        ) {
            System.out.println(val);
        }



    }
}
