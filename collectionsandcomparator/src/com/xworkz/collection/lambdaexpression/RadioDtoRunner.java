package com.xworkz.collection.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RadioDtoRunner {
    public static void main(String[] args) {
        RadioDTO radioDto=new RadioDTO("club", 99.9, 1999, "india");
        RadioDTO radioDto1=new RadioDTO("fever", 98.9, 1998, "newzealand");
        RadioDTO radioDto2=new RadioDTO("red", 95.9, 1899, "switzerland");
        RadioDTO radioDto3=new RadioDTO("All", 96.9, 1997, "pakistan");

        List<RadioDTO> list=new ArrayList<>();
        list.add(radioDto);
        list.add(radioDto1);
        list.add(radioDto2);
        list.add(radioDto3);


        Collections.sort(list,(o1, o2)->(o1.getName().compareTo(o2.getName())));
        System.out.println("name in asc");
        for(RadioDTO name:list) {
            System.out.println(name);
        }
        System.out.println("*****************************************");

        Collections.sort(list,(o1,o2)->(o2.getName().compareTo(o1.getName())));
        System.out.println("name in dsc");
        for(RadioDTO name:list) {
            System.out.println(name);
        }
        System.out.println("*******************************************");

        Collections.sort(list,(o1,o2)->(Double.compare(o1.getPoint(), o2.getPoint())));
        System.out.println("point in asc");
        for(RadioDTO point:list) {
            System.out.println(point);
        }
        System.out.println("***************************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getPoint(), o1.getPoint())));
        System.out.println("point in dsc");
        for(RadioDTO point:list) {
            System.out.println(point);
        }
        System.out.println("***************************************************");

        Collections.sort(list,(o1,o2)->(Integer.compare(o1.getInvented(), o2.getInvented())));
        System.out.println("invented in asc");
        for(RadioDTO invented:list) {
            System.out.println(invented);
        }
        System.out.println("*****************************************");
        Collections.sort(list,(o1,o2)->(Integer.compare(o2.getInvented(), o1.getInvented())));
        System.out.println("invented in dsc");
        for(RadioDTO invented:list) {
            System.out.println(invented);
        }
        System.out.println("**************************************");
        Collections.sort(list,(o1,o2)->(o1.getCountry().compareTo(o2.getCountry())));
        System.out.println("country in asc");
        for(RadioDTO country:list) {
            System.out.println(country);
        }
        System.out.println("****************************************");
        Collections.sort(list,(o1,o2)->(o2.getCountry().compareTo(o1.getCountry())));
        System.out.println("country in dsc");
        for(RadioDTO country:list) {
            System.out.println(country);
        }




    }
}
