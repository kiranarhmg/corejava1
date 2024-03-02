package com.xworkz.collection1.collectionexample.Book;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BikeRunner {
    public static void main(String[] args) {
        BikeShowRoomDTO bike=new BikeShowRoomDTO("xyz","pavan");
        BikeShowRoomDTO bike1=new BikeShowRoomDTO("abc","kumar");

        AddressDTO add=new AddressDTO("dvg",1234);
        AddressDTO add1=new AddressDTO("hvr",2361);

        Map<AddressDTO,BikeShowRoomDTO> map=new HashMap<>();
        map.put(add,bike);
        map.put(add1,bike1);

        System.out.println(  map.remove(add));
        System.out.println( map.get(add1));

    }
}
