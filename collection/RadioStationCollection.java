package com.xworkz.profile.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RadioStationCollection {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("kannada");
        collection.add("english");
        collection.add("hindi");
        collection.add("tamil");
        collection.add("telugu");
        collection.add("marati");
        collection.add("urdu");
        Iterator<String> iterator=collection.iterator();
        while (iterator.hasNext())
       {
           String str=iterator.next();
           if(str.endsWith("A")) {
               System.out.println("language is: " + str);
               System.out.println("*********************");
           }
           else {
               System.out.println("language is: " + str);
           }
       }
    }
}
