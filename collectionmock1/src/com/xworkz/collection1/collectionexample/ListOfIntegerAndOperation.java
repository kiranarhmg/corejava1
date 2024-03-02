package com.xworkz.collection1.collectionexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfIntegerAndOperation {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(25);
        list.add(7);
        list.add(11);

        Iterator<Integer> iterator= list.iterator();
        while (iterator.hasNext())
        {
            int in= iterator.next();
            if(in%2==0)
            {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
