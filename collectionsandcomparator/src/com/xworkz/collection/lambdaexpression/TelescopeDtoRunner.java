package com.xworkz.collection.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TelescopeDtoRunner {
    public static void main(String[] args) {
        TelescopeDTO telescopeDTO=new TelescopeDTO("celestron",50000,"equatorial","reflector");
        TelescopeDTO telescopeDTO2 = new TelescopeDTO("Orion", 70000, "Alt-Azimuth", "Refractor");
        TelescopeDTO telescopeDTO3 = new TelescopeDTO("SkyWatcher", 60000, "Equatorial", "Compound");
        TelescopeDTO telescopeDTO4 = new TelescopeDTO("Meade", 55000, "Alt-Azimuth", "Reflector");
        List<TelescopeDTO> list=new ArrayList<>();
        list.add(telescopeDTO);
        list.add(telescopeDTO2);
        list.add(telescopeDTO3);
        list.add(telescopeDTO4);

        Collections.sort(list,(l1, l2)->(Double.compare(l1.getCost(), l2.getCost())));
        System.out.println("cost in asc");
        for (TelescopeDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1, l2)->(Double.compare(l2.getCost(), l1.getCost())));
        System.out.println("cost in dsc");
        for (TelescopeDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(l2.getBrand().compareTo(l1.getBrand())));
        System.out.println("brand in dsc");
        for (TelescopeDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1, l2)->(l1.getBrand().compareTo(l2.getBrand())));
        System.out.println("brand in asc");
        for (TelescopeDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(l2.getType().compareTo(l1.getType())));
        System.out.println("type in dsc");
        for (TelescopeDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1, l2)->(l1.getType().compareTo(l2.getType())));
        System.out.println("type in asc");
        for (TelescopeDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
    }
}
