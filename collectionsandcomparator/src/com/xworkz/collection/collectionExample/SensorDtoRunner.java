package com.xworkz.collection.collectionExample;

import com.xworkz.collection.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

public class SensorDtoRunner {
    public static void main(String[] args) {
        SensorDto sensorDto=new SensorDto("ldr","light detecting",80.0,20);
        SensorDto sensorDto1=new SensorDto("ultrasonic","distance detecting",70.0,10);
        SensorDto sensorDto2=new SensorDto("infrared","temperature detecting",1000.0,50);
        List<SensorDto> collection=new ArrayList<>();
        collection.add(sensorDto);
        collection.add(sensorDto1);
        collection.add(sensorDto2);

        Comparator<SensorDto> comparator=new SensorCostComparatorAsc();
        Collections.sort(collection,comparator);
        System.out.println("cost in asc: ");
        for (SensorDto val:collection
             ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<SensorDto> comparator1=new SensorCostComparatorDsc();
        Collections.sort(collection,comparator1);
        System.out.println("cost in dsc: ");
        for (SensorDto val:collection
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<SensorDto> comparator2=new SensorNameComparatorAsc();
        Collections.sort(collection,comparator2);
        System.out.println("name in asc: ");
        for (SensorDto val:collection
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

       Comparator<SensorDto> comparator3=new SensorNameComparatorDsc();
        Collections.sort(collection,comparator3);
        System.out.println("name in dsc: ");
        for (SensorDto val:collection
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<SensorDto> comparator4=new SensorTypeComparatorAsc();
        Collections.sort(collection,comparator4);
        System.out.println("type in asc: ");
        for (SensorDto val:collection
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");
        Comparator<SensorDto> comparator5=new SensorTypeComparatorDsc();
        Collections.sort(collection,comparator5);
        System.out.println("type in dsc: ");
        for (SensorDto val:collection
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<SensorDto> comparator6=new SensorDistanceComparatorAsc();
        Collections.sort(collection,comparator6);
        System.out.println("distance in asc: ");
        for (SensorDto val:collection
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");

        Comparator<SensorDto> comparator7=new SensorDistanceComparatorDsc();

                Collections.sort(collection,comparator7);
        System.out.println("distance in dsc: ");
        for (SensorDto val:collection
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************************");






    }
}
