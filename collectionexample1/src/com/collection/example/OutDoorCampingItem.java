package com.collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OutDoorCampingItem {
    public static void main(String[] args) {
        List<String> campingItems = new ArrayList<>();
        campingItems.add("Tent");
        campingItems.add("Sleeping bag");
        campingItems.add("Camp stove");
        campingItems.add("Lantern");
        campingItems.add("Cooler");
        campingItems.add("First aid kit");
        campingItems.add("Hiking boots");
        campingItems.add("Water bottle");
        campingItems.add("Portable grill");
        campingItems.add("Mosquito repellent");

        System.out.println("items which has 't' in it");
        campingItems.stream().filter(ref->ref.contains("s")).forEach(r-> System.out.println(r));

        System.out.println("*********printing in desc order***********");
        campingItems.stream().sorted(Collections.reverseOrder()).forEach(r-> System.out.println(r));

        System.out.println("*********item which has least 5 char***********");
        campingItems.stream().filter(ref->ref.length()<=5).sorted(Collections.reverseOrder()).forEach(r-> System.out.println(r));

        System.out.println("*********convert upper case which has 'a' ***********");
      List<String> list=  campingItems.stream().filter(ref->ref.contains("a")).collect(Collectors.toList());
      list.forEach(l-> System.out.println(l.toUpperCase()));

        System.out.println("*********count of list ***********");

       long l= campingItems.stream().filter(ref->ref.contains("t")).count();


        System.out.println("********* item which has 'a' and 'o' ***********");
        campingItems.stream().filter(ref->ref.contains("a")&&ref.contains("o")).sorted().forEach(r-> System.out.println(r));









    }
}
