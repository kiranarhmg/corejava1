package com.xworkz.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlaramDtoRunner {
    public static void main(String[] args) {
        AlaramDTO alaramDTO=new AlaramDTO(200,"sonata");
        AlaramDTO alaramDTO1=new AlaramDTO(150,"fastrack");
        AlaramDTO alaramDTO2=new AlaramDTO(300,"firebolt");
        AlaramDTO alaramDTO3=new AlaramDTO(400,"noise");

        List<AlaramDTO> list=new ArrayList<>();
        list.add(alaramDTO);
        list.add(alaramDTO1);
        list.add(alaramDTO2);
        list.add(alaramDTO3);

        Collections.sort(list);
        //sorted on brand property
        for (AlaramDTO val:list
             ) {
            System.out.println(val);
        }

    }
}
