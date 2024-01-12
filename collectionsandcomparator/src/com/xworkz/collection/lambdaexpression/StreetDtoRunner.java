package com.xworkz.collection.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreetDtoRunner {
    public static void main(String[] args) {
        StreetDTO streetDTO=new StreetDTO("kr road",40,2,"cement");
        StreetDTO streetDTO2 = new StreetDTO("MG Road", 30, 4, "Asphalt");
        StreetDTO streetDTO3 = new StreetDTO("Main Street", 35, 3, "Concrete");
        StreetDTO streetDTO4 = new StreetDTO("Broadway", 50, 5, "Brick");

        List<StreetDTO> list=new ArrayList<>();
        list.add(streetDTO);
        list.add(streetDTO2);
        list.add(streetDTO3);
        list.add(streetDTO4);

        Collections.sort(list,(l1, l2)->(Double.compare(l1.getWidth(), l2.getWidth())));
        System.out.println("width in asc");
        for (StreetDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l2.getWidth(), l1.getWidth())));
        System.out.println("width in dsc");
        for (StreetDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l1.getDistance(), l2.getWidth())));
        System.out.println("distance in asc");
        for (StreetDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l2.getDistance(), l1.getWidth())));
        System.out.println("distance in dsc");
        for (StreetDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(l1.getName().compareTo(l2.getName())));
        System.out.println("name in asc");
        for (StreetDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(l2.getName().compareTo(l1.getName())));
        System.out.println("name in dsc");
        for (StreetDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(l1.getType().compareTo(l2.getType())));
        System.out.println("type in asc");
        for (StreetDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(l2.getType().compareTo(l1.getType())));
        System.out.println("type in dsc");
        for (StreetDTO val:list
        ) {
            System.out.println(val);
        }

    }
}
