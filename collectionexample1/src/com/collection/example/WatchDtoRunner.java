package com.collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WatchDtoRunner {
    public static void main(String[] args) {
       WatchDto watchDto=new WatchDto("fastrack",3000,"silver","india");
        WatchDto watchDto1=new WatchDto("titan",4000,"gold","india");
        WatchDto watchDto2=new WatchDto("fossil",23000,"black","usa");
        WatchDto watchDto3=new WatchDto("rolex",300000,"silver","uk");

        List<WatchDto> list=new ArrayList<>();
        list.add(watchDto);
        list.add(watchDto1);
        list.add(watchDto2);
        list.add(watchDto3);
        System.out.println("brand in asc");
        Collections.sort(list,(p1,p2)->p1.getBrand().compareTo(p2.getBrand()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("brand in dsc");
        Collections.sort(list,(p1,p2)->p2.getBrand().compareTo(p1.getBrand()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("cost in asc");
        Collections.sort(list,(p1,p2)->Double.compare(p1.getCost(),p2.getCost()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("cost in dsc");
        Collections.sort(list,(p1,p2)->Double.compare(p2.getCost(),p1.getCost()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("color in asc");
        Collections.sort(list,(p1,p2)->p1.getColor().compareTo(p2.getColor()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("color in dsc");
        Collections.sort(list,(p1,p2)->p2.getColor().compareTo(p1.getColor()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("country in asc");
        Collections.sort(list,(p1,p2)->p1.getCountry().compareTo(p2.getCountry()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("country in asc");
        Collections.sort(list,(p1,p2)->p2.getCountry().compareTo(p1.getCountry()));
        list.forEach(ref1-> System.out.println(ref1));



    }
}
