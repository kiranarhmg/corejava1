package com.xworkz.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RopeDtoRunner {
    public static void main(String[] args) {
        RopeDTO ropeDTO=new RopeDTO(12,10,50);
        RopeDTO ropeDTO1=new RopeDTO(15,14,60);
        RopeDTO ropeDTO2=new RopeDTO(20,18,40);
        RopeDTO ropeDTO3=new RopeDTO(10,15,80);
        RopeDTO ropeDTO4=new RopeDTO(25,11,70);

        List<RopeDTO> list=new ArrayList<>();
        list.add(ropeDTO);
        list.add(ropeDTO1);
        list.add(ropeDTO2);
        list.add(ropeDTO3);
        list.add(ropeDTO4);
        Collections.sort(list);

        // sorted on cost property
        for (RopeDTO val:list
        ) {
            System.out.println(val);
        }


    }
}
