package com.xworkz.collection1.collectionexample;

import java.util.ArrayList;
import java.util.List;

public class AddList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(5);

        list.forEach(ref-> System.out.println(ref));
    }
}
