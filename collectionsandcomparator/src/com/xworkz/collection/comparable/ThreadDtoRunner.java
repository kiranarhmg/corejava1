package com.xworkz.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadDtoRunner {
    public static void main(String[] args) {
        ThreadDTO threadDTO=new ThreadDTO(20,10,100);
        ThreadDTO threadDTO1=new ThreadDTO(30,20,200);
        ThreadDTO threadDTO2=new ThreadDTO(40,15,300);
        ThreadDTO threadDTO3=new ThreadDTO(50,25,400);
        ThreadDTO threadDTO4=new ThreadDTO(60,18,150);

        List<ThreadDTO> list=new ArrayList<>();
        list.add(threadDTO);
        list.add(threadDTO1);
        list.add(threadDTO2);
        list.add(threadDTO3);
        list.add(threadDTO4);

        Collections.sort(list);

        for (ThreadDTO val:list
        ) {
            System.out.println(val);
        }

    }
}
