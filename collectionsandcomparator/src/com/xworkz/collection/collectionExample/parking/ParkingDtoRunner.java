package com.xworkz.collection.collectionExample.parking;

import com.xworkz.collection.collectionExample.charcoal.CharcoalDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ParkingDtoRunner {
    public static void main(String[] args) {
        ParkingDTO parkingDTO=new ParkingDTO(400,20,"park1",20);
        ParkingDTO parkingDTO1=new ParkingDTO(600,25,"park2",25);
        ParkingDTO parkingDTO2=new ParkingDTO(800,30,"park3",30);
        ParkingDTO parkingDTO3=new ParkingDTO(900,35,"park4",35);

        List<ParkingDTO> list=new ArrayList<>();
        list.add(parkingDTO);
        list.add(parkingDTO1);
        list.add(parkingDTO2);
        list.add(parkingDTO3);

        Comparator<ParkingDTO> comparator=new ParkingNoOfVehicleComparatorAsc();
        Collections.sort(list,comparator);
        System.out.println("noofvehicle park in asc: ");
        for (ParkingDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************");
        Comparator<ParkingDTO> comparator1=new ParkingNoOfVehicleComparatorDsc();
        Collections.sort(list,comparator1);
        System.out.println("noofvehicle park in dsc: ");
        for (ParkingDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************");
        Comparator<ParkingDTO> comparator2=new ParkingSizeComparatorAsc();
        Collections.sort(list,comparator2);
        System.out.println("parking area size park in asc: ");
        for (ParkingDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************");
        Comparator<ParkingDTO> comparator3=new ParkingSizeComparatorDsc();
        Collections.sort(list,comparator3);
        System.out.println("parking area size park in dsc: ");
        for (ParkingDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************");
        Comparator<ParkingDTO> comparator4=new ParkingNameComparatorAsc();
        Collections.sort(list,comparator4);
        System.out.println("name  in asc: ");
        for (ParkingDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************");
        Comparator<ParkingDTO> comparator5=new ParkingNameComparatorDsc();
        Collections.sort(list,comparator5);
        System.out.println("name  in dsc: ");
        for (ParkingDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************");
        Comparator<ParkingDTO> comparator6=new ParkingNoComparatorAsc();
        Collections.sort(list,comparator6);
        System.out.println("parking no  in asc: ");
        for (ParkingDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************");
        Comparator<ParkingDTO> comparator7=new ParkingNoComparatorDsc();
        Collections.sort(list,comparator7);
        System.out.println("parking no  in dsc: ");
        for (ParkingDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("**********************************");





    }
}
