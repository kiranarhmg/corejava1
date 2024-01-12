package com.xworkz.collection.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShipDtoRunner {
    public static void main(String[] args) {
        ShipDTO shipDTO1 = new ShipDTO("Titanic", 30, 10, 500000000);
        ShipDTO shipDTO2 = new ShipDTO("Queen Mary 2", 35, 12, 600000000);
        ShipDTO shipDTO3 = new ShipDTO("Harmony of the Seas", 50, 15, 800000000);
        ShipDTO shipDTO4 = new ShipDTO("Costa Smeralda", 40, 13, 700000000);

        List<ShipDTO> list=new ArrayList<>();
        list.add(shipDTO1);
        list.add(shipDTO2);
        list.add(shipDTO3);
        list.add(shipDTO4);

        Collections.sort(list,(l1, l2)->(Double.compare(l1.getHeight(), l2.getHeight())));
        System.out.println("height in asc");
        for (ShipDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1, l2)->(Double.compare(l2.getHeight(), l1.getHeight())));
        System.out.println("height in dsc");
        for (ShipDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l1.getWidth(), l2.getWidth())));
        System.out.println("width in asc");
        for (ShipDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1, l2)->(Double.compare(l2.getWidth(), l1.getWidth())));
        System.out.println("width in dsc");
        for (ShipDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1, l2)->(Double.compare(l1.getCost(), l2.getCost())));
        System.out.println("cost in asc");
        for (ShipDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1, l2)->(Double.compare(l2.getCost(), l1.getCost())));
        System.out.println("cost in dsc");
        for (ShipDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1,l2)->(l1.getName().compareTo(l2.getName())));
        System.out.println("name in asc");
        for (ShipDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1,l2)->(l2.getName().compareTo(l1.getName())));
        System.out.println("name in dsc");
        for (ShipDTO val:list
        ) {
            System.out.println(val);
        }

    }
}
